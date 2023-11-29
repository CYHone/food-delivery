package com.fd.service;

import com.fd.dto.UserLoginDTO;
import com.fd.entity.User;
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
