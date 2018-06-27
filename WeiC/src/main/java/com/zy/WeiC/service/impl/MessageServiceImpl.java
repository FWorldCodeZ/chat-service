package com.zy.WeiC.service.impl;

import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.dao.MessageMapper;
import com.zy.WeiC.dao.RelationMessageCodeMapper;
import com.zy.WeiC.dao.UserMapper;
import com.zy.WeiC.pojo.RelationCode;
import com.zy.WeiC.pojo.RelationMessageCode;
import com.zy.WeiC.pojo.User;
import com.zy.WeiC.pojo.UserExample;
import com.zy.WeiC.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MessageServiceImpl  implements MessageService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RelationMessageCodeMapper relationMessageCodeMapper;
    JsonResult jsonResult;
    @Override
    public JsonResult sendMessage(User user, String name, String info) {
        jsonResult = new JsonResult();
        RelationMessageCode relationMessageCodes = new RelationMessageCode();
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.or();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(userExample);
            relationMessageCodes.setParentcode(users.get(0).getUsercode());

            UserExample.Criteria criteria1 = userExample.or();
            criteria1.andUsernameEqualTo(name);
            List<User> users1 = userMapper.selectByExample(userExample);
            if (users1.size() == 0) {
                jsonResult.setErrorCode("500");
                jsonResult.setMessage("消息发送失败");
                return jsonResult;
            }
            relationMessageCodes.setChildcode(users1.get(0).getUsercode());
            relationMessageCodes.setMessageinfo(info);

            relationMessageCodeMapper.insert(relationMessageCodes);

            relationMessageCodes.setParentcode(users1.get(0).getUsercode());
            relationMessageCodes.setChildcode(users.get(0).getUsercode());
            relationMessageCodes.setMessageinfo(info);
            relationMessageCodeMapper.insert(relationMessageCodes);
            List<HashMap<String,String>> arrayList = new ArrayList<>();
            HashMap<String,String> map=new HashMap();
            map.put("username",user.getUsername());
            map.put("Flags","1");
            map.put("info",info);
            arrayList.add(map);
            HashMap map1=new HashMap();
            map1.put("data",arrayList);
            jsonResult.setItem(map1);
            jsonResult.setMessage("消息发送成功");
            jsonResult.setErrorCode("200");
        } catch (Exception e) {
            jsonResult.setMessage("消息发送失败");
            jsonResult.setErrorCode("500");
        }
        return jsonResult;
    }

    @Override
    public JsonResult loadMessage(User user, String name) {
        jsonResult=new JsonResult();
        return jsonResult;
    }
}
