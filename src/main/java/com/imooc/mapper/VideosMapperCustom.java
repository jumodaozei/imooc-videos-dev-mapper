package com.imooc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.pojo.Videos;
import com.imooc.pojo.vo.VideosVO;
import com.imooc.utils.MyMapper;

public interface VideosMapperCustom extends MyMapper<Videos> {
	
	public List<VideosVO> queryAllVideos(@Param("videoDesc") String videoDesc,@Param("userId") String userId);
	
	/**
	 * 对视频喜欢的数量累加
	 * @param videoId
	 */
	public void addVideoLikeCount(@Param("videoid") String videoId);
	
	/**
	 * 对视频喜欢的数量累减
	 * @param videoId
	 */
	public void reduceVideoLikeCount(@Param("videoid") String videoId);
	
	/**
	 * 查询我喜欢的视频
	 * @param userId
	 * @return
	 */
	public List<VideosVO> queryMyLikeVideos(String userId);
	
	/**
	 * @Description: 查询关注的视频
	 */
	public List<VideosVO> queryMyFollowVideos(String userId);
	
}