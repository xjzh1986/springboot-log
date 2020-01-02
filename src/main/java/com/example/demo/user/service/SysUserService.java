package com.example.demo.user.service;

import com.example.demo.user.entity.SysUser;
import com.example.demo.user.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    public SysUser selectByPrimaryKey(Integer userId){
        return  sysUserMapper.selectByPrimaryKey(userId);
    }



}
