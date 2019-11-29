package com.capgemini.zuul.service;

import com.capgemini.zuul.bean.User;
import com.capgemini.zuul.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * 随带写Bug的程序猿
 *
 * @auther xuyaohui
 * @date 2018/8/29
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserByAccount(String userAccount){

        User user=userDao.getUserByName(userAccount);
        if (user!=null){

           Set<String> permissions = userDao.getUserPermissions(userAccount);

            user.setPermission(permissions);

            //获取菜单
            user.setMenuList(userDao.getMenuListByName(userAccount));
        }

        return user;
    }

}
