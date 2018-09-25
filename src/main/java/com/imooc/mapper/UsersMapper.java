package com.imooc.mapper;

import org.apache.ibatis.annotations.Param;

import com.imooc.pojo.Users;
import com.imooc.utils.MyMapper;

public interface UsersMapper extends MyMapper<Users> {
	public void addReceiveLikeCount(@Param("userid") String userId);
	
	public void reduceReceiveLikeCount(@Param("userid") String userId);
	
	/**
	 * 增加粉丝数量
	 * @param userId
	 */
	public void addFansCount(String userId);
	
	
	/**
	 * 减少粉丝数量
	 * @param userId
	 */
	public void reduceFansCount(String userId);
	
	
	/**
	 * 增加关注数
	 * @param userId
	 */
	public void addFollowerCount(String userId);
	
	
	/**
	 * 减少关注数
	 * @param userId
	 */
	public void reduceFollowerCount(String userId);
}