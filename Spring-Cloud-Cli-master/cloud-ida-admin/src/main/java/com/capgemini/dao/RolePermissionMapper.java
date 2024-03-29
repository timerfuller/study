package com.capgemini.dao;

import com.capgemini.bean.po.RolePermission;
import com.capgemini.bean.vo.RolePermissionVO;

import java.util.List;

public interface RolePermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByRoleId(Integer roleId);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    List<RolePermissionVO> listRolepermissions(Integer roleId);

    List<RolePermission> listRolepermission(Integer roleId);

    Integer batchInsert(List<RolePermission> rolepermissions);
}