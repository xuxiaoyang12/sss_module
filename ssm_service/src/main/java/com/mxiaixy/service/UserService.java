package com.mxiaixy.service;

import com.mxiaixy.dao.UserDao;
import com.mxiaixy.pojo.User;

/**
 * Created by Mxia on 2017/2/28.
 */
public class UserService {


    private UserDao userDao = new UserDao();

    public void saveUser(User user){
        userDao.save(user);
    }

}
