package com.capgemini.tag.repository;

import com.capgemini.tag.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xuyaohui
 */

@Repository
public interface UserRepository {

    /**
     * 通过UserId获取用户信息
     * @param userId
     * @return
     */
    List<User> getUserByUserId(String userId);
}
