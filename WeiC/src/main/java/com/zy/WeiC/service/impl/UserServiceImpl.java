package com.zy.WeiC.service.impl;

import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.dao.RelationCodeMapper;
import com.zy.WeiC.dao.UserMapper;
import com.zy.WeiC.pojo.RelationCode;
import com.zy.WeiC.pojo.RelationCodeExample;
import com.zy.WeiC.pojo.User;
import com.zy.WeiC.pojo.UserExample;
import com.zy.WeiC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RelationCodeMapper relationCodeMapper;

    JsonResult jsonResult;

    @Override
    public List<User> selectAdminByUserName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.or();
        criteria.andUsernameEqualTo(name);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public User selectAdminById(Integer id) {
        return null;
    }

    @Override
    public JsonResult insertAdminInfo(User user) {
        jsonResult = new JsonResult();
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.or();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size() != 0) {
                jsonResult.setMessage("名字重复");
                jsonResult.setErrorCode("500");
                return jsonResult;
            }
            int id = (int) (Math.random() * 10000);

            user.setId(id);
            userMapper.insert(user);
            jsonResult.setMessage("添加成功");
            jsonResult.setErrorCode("200");
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setMessage("添加失败");
            jsonResult.setErrorCode("500");
        }
        return jsonResult;
    }

    @Override
    public JsonResult selectAllAdminFriends(String name, User user) {
        jsonResult = new JsonResult();
        return jsonResult;
    }

    @Override
    public JsonResult addAllAdminFriends(String name, User user) {

        jsonResult = new JsonResult();
        RelationCode relationCodes = new RelationCode();
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria1 = userExample.or();
            criteria1.andUsernameEqualTo(name);
            List<User> users1 = userMapper.selectByExample(userExample);
            relationCodes.setParentcode(users1.get(0).getUsercode());
            UserExample.Criteria criteria = userExample.or();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size() == 0) {
                jsonResult.setErrorCode("500");
                jsonResult.setMessage("联系人查找失败");
                return jsonResult;
            }
            relationCodes.setChildcode(users.get(0).getUsercode());
            relationCodeMapper.insert(relationCodes);
            relationCodes.setParentcode(users.get(0).getUsercode());
            relationCodes.setChildcode(users1.get(0).getUsercode());
            relationCodeMapper.insert(relationCodes);
            jsonResult.setMessage("联系人添加成功");
            jsonResult.setErrorCode("200");
        } catch (Exception e) {
            jsonResult.setMessage("联系人添加失败");
            jsonResult.setErrorCode("500");
        }
        return jsonResult;
    }

    @Override
    public JsonResult userLoad(User user) {
        jsonResult = new JsonResult();
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria1 = userExample.or();
            criteria1.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(userExample);
            RelationCodeExample relationCodeExample = new RelationCodeExample();
            RelationCodeExample.Criteria criteria = relationCodeExample.or();
            criteria.andParentcodeEqualTo(users.get(0).getUsercode());
            List<RelationCode> relationCodes = relationCodeMapper.selectByExample(relationCodeExample);


            Map map = new HashMap();
           List<User> arrayList = new ArrayList<User>();
            for (int i = 0; i < relationCodes.size(); i++) {
                UserExample userExamples = new UserExample();
                UserExample.Criteria criteria2 = userExamples.or();
                criteria2.andUsercodeEqualTo(relationCodes.get(i).getChildcode());
                arrayList.addAll(userMapper.selectByExample(userExamples));
            }
            map.put("data", arrayList);
            jsonResult.setItem(map);
            jsonResult.setErrorCode("200");
            jsonResult.setMessage("加载成功");
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setErrorCode("500");
            jsonResult.setMessage("加载失败");
        }
        return jsonResult;
    }


}
