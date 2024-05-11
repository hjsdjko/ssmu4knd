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


import com.dao.HuodongshangchangDao;
import com.entity.HuodongshangchangEntity;
import com.service.HuodongshangchangService;
import com.entity.vo.HuodongshangchangVO;
import com.entity.view.HuodongshangchangView;

@Service("huodongshangchangService")
public class HuodongshangchangServiceImpl extends ServiceImpl<HuodongshangchangDao, HuodongshangchangEntity> implements HuodongshangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongshangchangEntity> page = this.selectPage(
                new Query<HuodongshangchangEntity>(params).getPage(),
                new EntityWrapper<HuodongshangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongshangchangEntity> wrapper) {
		  Page<HuodongshangchangView> page =new Query<HuodongshangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongshangchangVO> selectListVO(Wrapper<HuodongshangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongshangchangVO selectVO(Wrapper<HuodongshangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongshangchangView> selectListView(Wrapper<HuodongshangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongshangchangView selectView(Wrapper<HuodongshangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
