package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;
import com.example.demo.query.UserLoginQuery;
import com.example.demo.vo.LoginResultVO;
import com.example.demo.vo.UserVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface UserService extends IService<User> {
    LoginResultVO login(UserLoginQuery query);

    //    根据用户id 获取用户信息
//    @paran userId
//    @return
    User getUserInfo(Integer userId);

    //“修改用户信息
//    @paran usaPVC
//        @roturn
    UserVO editUserInfo(UserVO userVO);

    String editUserAvatar(Integer userId, MultipartFile file);


}