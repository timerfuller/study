package com.capgemini.service.interfaces;

import com.capgemini.bean.po.Permission;
import java.util.List;

public interface PermissionService {

    Integer add(Permission permission);

    Integer delete(Integer permissionId);

    Integer update(Permission permission);

    Permission selectByPrimaryKey(Integer permissionId);

    List<Permission> listPermissionWithParName(Permission permission);

    List<Permission> listPermission(Permission permission);

    List<Permission> listPermissionView();

    List<Permission> getUserpermissions(Integer userId);

}
