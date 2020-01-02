package com.example.demo.role.service;

import com.example.demo.role.entity.SysRole;

import com.example.demo.role.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;


    public SysRole selectByPrimaryKey(Integer roleId){
        return sysRoleMapper.selectByPrimaryKey(roleId);
    }


}
