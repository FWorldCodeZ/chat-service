package com.zy.WeiC.service;

import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectAdminByUserName(String  name);
    User selectAdminById(Integer id);
    JsonResult insertAdminInfo(User user);
    JsonResult selectAllAdminFriends(String name,User user);
    JsonResult addAllAdminFriends(String name,User user);
    JsonResult userLoad(User user);
}
