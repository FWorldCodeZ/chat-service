package com.zy.WeiC.controller;

import com.zy.WeiC.common.JsonResult;
import com.zy.WeiC.pojo.User;
import com.zy.WeiC.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/v1/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    JsonResult jsonResult;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult sendMessage(User user,
                                  @RequestParam(value = "name", required = false) String name,
                                  @RequestParam(value = "info", required = false)String info){
        jsonResult=new JsonResult();
        jsonResult=messageService.sendMessage(user,name,info);
        return jsonResult;
    }
}
