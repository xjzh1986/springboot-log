package com.example.demo.user.controller;


import com.example.demo.log.entity.SysLogAnnotation;
import com.example.demo.user.entity.SysUser;
import com.example.demo.user.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUser")
public class indexController {

    // logback
    private final static Logger logger = LoggerFactory.getLogger(indexController.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    @ResponseBody
    @SysLogAnnotation("系统用户首页")
    public String index(@RequestBody SysUser sysUserParam) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(1);
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.error("记录了error错误日志");
//        int i = 10/0;
        return "success";
    }
}
