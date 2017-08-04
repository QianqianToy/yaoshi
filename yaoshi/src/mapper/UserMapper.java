package mapper;

import domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * TODO()
 * Created by zqq on 2017/8/3 0003.
 */
public interface UserMapper {

    @Select("select * from users where username=#{param1} and password=#{param2} ")
    User selectUser(String username, String password);//登录

}
