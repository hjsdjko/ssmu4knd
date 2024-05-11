package com.dao;

import com.entity.SaishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishixinxiVO;
import com.entity.view.SaishixinxiView;


/**
 * 赛事信息
 * 
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
public interface SaishixinxiDao extends BaseMapper<SaishixinxiEntity> {
	
	List<SaishixinxiVO> selectListVO(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
	
	SaishixinxiVO selectVO(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
	
	List<SaishixinxiView> selectListView(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);

	List<SaishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
	
	SaishixinxiView selectView(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
	
}
