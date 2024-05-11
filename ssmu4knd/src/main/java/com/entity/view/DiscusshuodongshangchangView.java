package com.entity.view;

import com.entity.DiscusshuodongshangchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动商场评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 21:25:06
 */
@TableName("discusshuodongshangchang")
public class DiscusshuodongshangchangView  extends DiscusshuodongshangchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuodongshangchangView(){
	}
 
 	public DiscusshuodongshangchangView(DiscusshuodongshangchangEntity discusshuodongshangchangEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuodongshangchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
