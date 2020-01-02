package com.example.demo.role.mapper;

import com.example.demo.role.entity.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Integer roleId);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}