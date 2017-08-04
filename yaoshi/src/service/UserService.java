package service;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO()
 * Created by zqq on 2017/8/3 0003.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password){
        return userMapper.selectUser(username,password);
    }//登录
}
