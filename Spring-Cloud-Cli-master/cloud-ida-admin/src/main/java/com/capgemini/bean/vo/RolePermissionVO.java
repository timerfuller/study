package com.capgemini.bean.vo;


import com.capgemini.bean.po.Permission;
import com.capgemini.bean.po.Role;

public class RolePermissionVO extends Role {

    private Permission permission;//角色拥有的权限

    public void setpermission(Permission permission) {
        this.permission = permission;
    }

    public Permission getpermission() {
        return permission;
    }
}
