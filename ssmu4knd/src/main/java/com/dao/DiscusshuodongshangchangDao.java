package com.dao;

import com.entity.DiscusshuodongshangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuodongshangchangVO;
import com.entity.view.DiscusshuodongshangchangView;


/**
 * 活动商场评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-17 21:25:06
 */
public interface DiscusshuodongshangchangDao extends BaseMapper<DiscusshuodongshangchangEntity> {
	
	List<DiscusshuodongshangchangVO> selectListVO(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
	
	DiscusshuodongshangchangVO selectVO(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
	
	List<DiscusshuodongshangchangView> selectListView(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);

	List<DiscusshuodongshangchangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
	
	DiscusshuodongshangchangView selectView(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
	
}
