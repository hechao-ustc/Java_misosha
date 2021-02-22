package com.miaoshaproject.service;

import com.miaoshaproject.error.BuinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BuinessException;

    /*
     * telphone：用户注册手机号
     * password：用户加密后的密码
     * */
    UserModel validateLogin(String telphone, String encryptPassword) throws BuinessException;
}
