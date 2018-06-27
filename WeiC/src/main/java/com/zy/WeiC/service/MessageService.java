package com.zy.WeiC.service;

import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.pojo.User;

public interface MessageService {
    JsonResult sendMessage(User user, String name, String info);
    JsonResult loadMessage(User user,String name);
}
