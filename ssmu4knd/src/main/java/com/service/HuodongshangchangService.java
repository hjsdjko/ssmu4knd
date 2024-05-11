package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongshangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongshangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongshangchangView;


/**
 * 活动商场
 *
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
public interface HuodongshangchangService extends IService<HuodongshangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongshangchangVO> selectListVO(Wrapper<HuodongshangchangEntity> wrapper);
   	
   	HuodongshangchangVO selectVO(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
   	
   	List<HuodongshangchangView> selectListView(Wrapper<HuodongshangchangEntity> wrapper);
   	
   	HuodongshangchangView selectView(@Param("ew") Wrapper<HuodongshangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongshangchangEntity> wrapper);
   	
}

