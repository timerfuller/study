package com.capgemini.bean.vo;


import com.capgemini.bean.po.Permission;

import java.util.List;

public class PermissionView extends Permission {
    private List<Permission> childpermissions;

    public List<Permission> getChildpermissions() {
        return childpermissions;
    }

    public void setChildpermissions(List<Permission> childpermissions) {
        this.childpermissions = childpermissions;
    }
}
