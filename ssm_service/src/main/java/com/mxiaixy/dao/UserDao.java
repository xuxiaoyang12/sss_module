package com.mxiaixy.dao;

import com.mxiaixy.pojo.User;

/**
 * Created by Mxia on 2017/2/28.
 */
public class UserDao  {

    public void save(User user){

        System.out.println("save"+user.getName());
    }
}
