package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SaishixinxiDao;
import com.entity.SaishixinxiEntity;
import com.service.SaishixinxiService;
import com.entity.vo.SaishixinxiVO;
import com.entity.view.SaishixinxiView;

@Service("saishixinxiService")
public class SaishixinxiServiceImpl extends ServiceImpl<SaishixinxiDao, SaishixinxiEntity> implements SaishixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishixinxiEntity> page = this.selectPage(
                new Query<SaishixinxiEntity>(params).getPage(),
                new EntityWrapper<SaishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishixinxiEntity> wrapper) {
		  Page<SaishixinxiView> page =new Query<SaishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishixinxiVO> selectListVO(Wrapper<SaishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishixinxiVO selectVO(Wrapper<SaishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishixinxiView> selectListView(Wrapper<SaishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishixinxiView selectView(Wrapper<SaishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
