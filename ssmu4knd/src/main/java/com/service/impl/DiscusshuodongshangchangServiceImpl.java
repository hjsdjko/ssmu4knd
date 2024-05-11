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


import com.dao.DiscusshuodongshangchangDao;
import com.entity.DiscusshuodongshangchangEntity;
import com.service.DiscusshuodongshangchangService;
import com.entity.vo.DiscusshuodongshangchangVO;
import com.entity.view.DiscusshuodongshangchangView;

@Service("discusshuodongshangchangService")
public class DiscusshuodongshangchangServiceImpl extends ServiceImpl<DiscusshuodongshangchangDao, DiscusshuodongshangchangEntity> implements DiscusshuodongshangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuodongshangchangEntity> page = this.selectPage(
                new Query<DiscusshuodongshangchangEntity>(params).getPage(),
                new EntityWrapper<DiscusshuodongshangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuodongshangchangEntity> wrapper) {
		  Page<DiscusshuodongshangchangView> page =new Query<DiscusshuodongshangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuodongshangchangVO> selectListVO(Wrapper<DiscusshuodongshangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuodongshangchangVO selectVO(Wrapper<DiscusshuodongshangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuodongshangchangView> selectListView(Wrapper<DiscusshuodongshangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuodongshangchangView selectView(Wrapper<DiscusshuodongshangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
