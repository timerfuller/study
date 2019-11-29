package com.capgemini.service.interfaces;

import com.capgemini.bean.po.Role;
import com.capgemini.bean.po.RolePermission;
import com.capgemini.bean.vo.RolePermissionVO;

import java.util.List;

public interface RoleService {

    Integer add(Role role);

    Integer delete(Integer roleId);

    Integer update(Role role);

    List<Role> listRole(Role role);

    Role selectByPrimaryKey(Integer roleId);

    List<RolePermission> listRolepermission(Integer roleId);

    List<RolePermissionVO> listRolepermissions(Integer roleId);

    Integer batchInsert(List<RolePermission> rolepermissions);

    Integer deleteByRoleId(Integer roleId);

}
