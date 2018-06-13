package com.express.controller;

import com.express.basic.ResponseCode;
import com.express.basic.ReturnMessage;
import com.express.model.User;
import com.express.service.UserService;
import com.express.utils.QiNiuUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * <br/>
 * fan 2018/6/13 11:07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据用户id获取用户", httpMethod = "GET", notes = "根据用户id获取用户")
    @GetMapping("/getUser")
    public ReturnMessage getUser(@RequestParam Integer uid){
        User user = userService.selectByPrimaryKey(uid);
        return new ReturnMessage(ResponseCode.OK, user);
    }

    @ApiOperation(value = "修改用户头像", httpMethod = "POST", notes = "修改用户头像")
    @PostMapping("/updateAvatar")
    public ReturnMessage updateAvatar(@RequestParam Integer uid, MultipartFile file){
        String avatarUrl = QiNiuUtil.manageFile(file);
        User tmpUser = new User();
        tmpUser.setId(uid);
        tmpUser.setAvatarurl(avatarUrl);
        int i = userService.updateByPrimaryKeySelective(tmpUser);
        return new ReturnMessage(ResponseCode.OK, i);
    }
}