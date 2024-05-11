package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishixinxiView;


/**
 * 赛事信息
 *
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
public interface SaishixinxiService extends IService<SaishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishixinxiVO> selectListVO(Wrapper<SaishixinxiEntity> wrapper);
   	
   	SaishixinxiVO selectVO(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
   	
   	List<SaishixinxiView> selectListView(Wrapper<SaishixinxiEntity> wrapper);
   	
   	SaishixinxiView selectView(@Param("ew") Wrapper<SaishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishixinxiEntity> wrapper);
   	
}

