package com.imooc.mapper;

import org.apache.ibatis.annotations.Param;

import com.imooc.pojo.Users;
import com.imooc.utils.MyMapper;

public interface UsersMapper extends MyMapper<Users> {
	public void addReceiveLikeCount(@Param("userid") String userId);
	
	public void reduceReceiveLikeCount(@Param("userid") String userId);
}