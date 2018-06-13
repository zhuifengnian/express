package com.express.controller;

import com.express.basic.ResponseCode;
import com.express.basic.ReturnMessage;
import com.express.model.Express;
import com.express.service.ExpressService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 快递controller<br/>
 * fan 2018/6/13 10:59
 */
@RestController
@RequestMapping("/express")
public class ExpressController {
    @Autowired
    private ExpressService expressService;

    @ApiOperation(value = "根据express数据，获取对应的快递", httpMethod = "POST", notes = "根据express数据，获取对应的快递")
    @PostMapping("/getExpress")
    public ReturnMessage getExpress(Express express){
//        expressService.selec
        return new ReturnMessage(ResponseCode.OK, "测试");
    }
}