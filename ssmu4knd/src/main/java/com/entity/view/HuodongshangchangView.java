package com.entity.view;

import com.entity.HuodongshangchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动商场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
@TableName("huodongshangchang")
public class HuodongshangchangView  extends HuodongshangchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongshangchangView(){
	}
 
 	public HuodongshangchangView(HuodongshangchangEntity huodongshangchangEntity){
 	try {
			BeanUtils.copyProperties(this, huodongshangchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
