package com.example.demo.role.controller;


import com.example.demo.log.entity.SysLogAnnotation;
import com.example.demo.role.entity.SysRole;
import com.example.demo.role.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysRole")
@Api(tags = "角色操作模块")
public class SysRoleController {

    // logback
    private final static Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "角色添加图书", notes = "角色添加图书")
//    @SysLogAnnotation("角色操作模块")
    public String index() {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(1);
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.error("记录了error错误日志");
        int i = 50/0;
        return "success";
    }
}
