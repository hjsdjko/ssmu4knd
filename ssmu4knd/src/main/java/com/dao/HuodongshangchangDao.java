package com.dao;

import com.entity.HuodongshangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongshangchangVO;
import com.entity.view.HuodongshangchangView;


/**
 * 活动商场
 * 
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
public interface HuodongshangchangDao extends BaseMapper<HuodongshangchangEntity> {
	
	List<HuodongshangchangVO> selectListVO(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
	
	HuodongshangchangVO selectVO(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
	
	List<HuodongshangchangView> selectListView(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);

	List<HuodongshangchangView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
	
	HuodongshangchangView selectView(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
	
}
