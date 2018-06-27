package com.zy.WeiC.controller;


import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.pojo.User;
import com.zy.WeiC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    JsonResult jsonResult;
    /*
    *  @ResponseBody：自动转换成josn对象传到前端
    * */
      /*
    *  @ResponseBody：自动转换成josn对象传到前端
    *  @param Admin admin 注入
    * */

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult userLogin(User user,
                                @RequestParam(value = "userpassword", required = false) Integer userpassword,
                                HttpServletResponse httpServletResponse,
                                HttpServletRequest httpServletRequest) {//处理用户登陆
        JsonResult jsonResult = new JsonResult();
//        String  username=httpServletRequest.getParameter("username");
//       String  password2=httpServletRequest.getParameter("password");
//        System.out.println("122333:"+password2);
        String repass = httpServletRequest.getParameter("userpassword");
        System.out.println("UserController11:" + repass);

        List<User> users = userService.selectAdminByUserName(user.getUsername());
        System.err.println("1UserController111:" + user.getUsername());
        if (users.size() > 0 && !users.equals("")) {
            User _user = users.get(0);
            String password1 = _user.getUserpassword();
            System.err.println("UserController111:" + user);
            String newpassword = user.getUserpassword();
            System.err.println("11UserControllers11:" + newpassword);
            if (password1.equals(newpassword)) {
                Map map = new HashMap();
                map.put("data", users);
                jsonResult.setItem(map);
                jsonResult.setErrorCode("200");
                jsonResult.setMessage("登陆成功");
            } else {
                jsonResult.setErrorCode("500");
                jsonResult.setMessage("密码错误");
            }

        } else {
            jsonResult.setErrorCode("500");
            jsonResult.setMessage("用户不存在，请注册！");
        }
        return jsonResult;
    }

    @RequestMapping(value = "/load", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult userLoad(User user) {//处理用户登陆
        JsonResult jsonResult = new JsonResult();
        System.out.println("userLoad" + user.getUsername());
        jsonResult = userService.userLoad(user);
        return jsonResult;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult userInsert(User user, @RequestParam(value = "userpassword", required = false) Integer userpassword,
                                 HttpServletResponse httpServletResponse,
                                 HttpServletRequest httpServletRequest) {//处理用户注册
        jsonResult = new JsonResult();
        if (user.getUsername() == null && user.getUsername().equals("")) {
            jsonResult.setErrorCode("500");
            jsonResult.setMessage("名字不能为空");
            return jsonResult;
        }
//        int code = (int)(Math.random() * 10000);
//        user.setUsercode(code);
/*
* 这里插入用户其他数据
*
* */
        //user.setCreatTime(new Timestamp(System.currentTimeMillis()));

        jsonResult = userService.insertAdminInfo(user);
        return jsonResult;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult selectAllAdminFriends(User user) {
        jsonResult = new JsonResult();
        return jsonResult;
    }

    @RequestMapping(value = "/add ", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult addAllAdminFriends(User user, @RequestParam(value = "name", required = false) String  name) {
        jsonResult = new JsonResult();
        jsonResult = userService.addAllAdminFriends(name, user);
        return jsonResult;
    }
}