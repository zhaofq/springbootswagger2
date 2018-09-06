package com.example.swagger2.mapper;

import com.example.swagger2.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author: zhaofq
 * @description: UserMapper
 * @create: 2018-09-05 09:34
 **/
@Mapper
//@Component(value = "userMapper")
public interface UserMapper {
    /**
     * 查询用户根据phone
     * @param mobile
     * @return
     */
    @Select("SELECT * FROM TB_USER WHERE mobile = #{mobile}")
    User findUserByMobile(@Param("mobile") String mobile);

    /**
     * 
     * @param name
     * @param password
     * @param phone
     * @return
     */
    @Insert("INSERT INTO TB_USER(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{mobile})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("mobile") String phone);

    /**
     * 
     * @param mobile
     * @return
     */
    @Delete("DELETE FROM TB_USER WHERE  mobile = #{mobile}")
    int deleteUserByMobile(@Param("mobile") String mobile);
    
    @Update("")
    int updateUserByMobile(@Param("mobile") String mobile);
}
