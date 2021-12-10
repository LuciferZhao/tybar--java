package com.org.tybar.mapper;

import com.org.tybar.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    // 查询所有用户
    List<UserInfo> getUserInfoList();

    //查询用户
    UserInfo getUserInfo(String email,String password);

    // 新增用户
    int addUser(UserInfo userInfo);

    //根据用户名查询用户
    UserInfo findUserByName(String username);

    //根据邮箱查询用户
    UserInfo findUserByEmail(String email);
}
