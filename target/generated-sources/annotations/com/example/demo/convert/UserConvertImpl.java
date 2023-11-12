package com.example.demo.convert;

import com.example.demo.entity.User;
import com.example.demo.vo.LoginResultVO;
import com.example.demo.vo.UserVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T09:38:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    @Override
    public User convert(UserVO entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.setId( entity.getId() );
        user.setAccount( entity.getAccount() );
        user.setNickname( entity.getNickname() );
        user.setMobile( entity.getMobile() );
        user.setAvatar( entity.getAvatar() );
        user.setGender( entity.getGender() );
        user.setProfession( entity.getProfession() );
        user.setProvinceCode( entity.getProvinceCode() );
        user.setCityCode( entity.getCityCode() );
        user.setCountyCode( entity.getCountyCode() );

        user.setBirthday( MapStruct.transferTimeStamp(entity.getBirthday()) );

        return user;
    }

    @Override
    public UserVO convertToUserVO(User user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( user.getId() );
        userVO.setMobile( user.getMobile() );
        userVO.setNickname( user.getNickname() );
        userVO.setAvatar( user.getAvatar() );
        userVO.setAccount( user.getAccount() );
        userVO.setGender( user.getGender() );
        userVO.setProfession( user.getProfession() );
        userVO.setProvinceCode( user.getProvinceCode() );
        userVO.setCityCode( user.getCityCode() );
        userVO.setCountyCode( user.getCountyCode() );

        userVO.setBirthday( MapStruct.transferTime(user.getBirthday()) );

        return userVO;
    }

    @Override
    public LoginResultVO convertToLoginResultVO(User user) {
        if ( user == null ) {
            return null;
        }

        LoginResultVO loginResultVO = new LoginResultVO();

        loginResultVO.setId( user.getId() );
        loginResultVO.setMobile( user.getMobile() );
        loginResultVO.setNickname( user.getNickname() );
        loginResultVO.setAvatar( user.getAvatar() );
        loginResultVO.setAccount( user.getAccount() );

        return loginResultVO;
    }
}
