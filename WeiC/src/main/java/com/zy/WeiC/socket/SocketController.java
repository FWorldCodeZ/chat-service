package com.zy.WeiC.socket;




import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketController {
    private static final int PORT=9999;
    private List<Socket> mList=new ArrayList<Socket>();//客服端集合
    private ServerSocket server=null;//监听端口发送过来的信息
    private ExecutorService mExecutorService=null;//thread pool
    public static void main(String[] args ){ new SocketController();}//启动程序

public SocketController(){
        try{
            server=new ServerSocket(PORT);
            mExecutorService= Executors.newCachedThreadPool();//create a thread pool
            System.out.print("服务器已启动");
            Socket client=null;//客户端
            while(true){
                client=server.accept();
                //把客户端放入客户端集合中
                mList.add(client);
                mExecutorService.execute(new Service(client));//start a new thread to handle to connection

            }
        }catch (Exception e){
e.printStackTrace();
        }

}
class Service implements Runnable{
    private Socket socket;
    private BufferedReader in=null;
    private String msg="";
    public  Service(Socket socket){this.socket=socket;
    try {
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //客服端只要连接到服务器，便向客服端发送下面的信息
        msg="服务器地址："+this.socket.getInetAddress()+"com toal:"+mList.size()+"(服务器发送)";
        this.sendmsg();

    }catch (Exception e){

    }

    }

    @Override
    public void run() {
try {
    while(true){
        if ((msg=in.readLine())!=null){
            //当客服端发送消息为：exit时，关闭连接
           if (msg.equals("exit")){
               System.out.println();
               mList.remove(socket);
               in.close();
               msg="user:"+socket.getInetAddress()+"exit total:"+mList.size();
               socket.close();
               this.sendmsg();
               break;
           }else{
               msg=socket.getInetAddress()+":"+msg+"(服务器发送)";
               this.sendmsg();
           }

        }
    }
}catch (Exception e){
    e.printStackTrace();
}
    }
    /*
* 循环遍历客服端集合，给每个客户端发送信息
* */
    public  void sendmsg(){
        System.out.println(msg);

            int num=mList.size();
            for(int i=0;i<num;i++){
            Socket mSocket=mList.get(i);
                PrintWriter pout=null;
         try {
             pout=new PrintWriter(new BufferedWriter(
                     new OutputStreamWriter(mSocket.getOutputStream())),true);
             pout.println(msg);
         }catch (IOException  e){
             e.printStackTrace();
         }

        }
    }
}

}