package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuodongshangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuodongshangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuodongshangchangView;


/**
 * 活动商场评论表
 *
 * @author 
 * @email 
 * @date 2021-05-17 21:25:06
 */
public interface DiscusshuodongshangchangService extends IService<DiscusshuodongshangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuodongshangchangVO> selectListVO(Wrapper<DiscusshuodongshangchangEntity> wrapper);
   	
   	DiscusshuodongshangchangVO selectVO(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
   	
   	List<DiscusshuodongshangchangView> selectListView(Wrapper<DiscusshuodongshangchangEntity> wrapper);
   	
   	DiscusshuodongshangchangView selectView(@Param("ew") Wrapper<DiscusshuodongshangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuodongshangchangEntity> wrapper);
   	
}

