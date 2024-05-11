package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 赛事信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
@TableName("saishixinxi")
public class SaishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaishixinxiEntity() {
		
	}
	
	public SaishixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 比赛名称
	 */
					
	private String bisaimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 比赛日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date bisairiqi;
	
	/**
	 * 比赛时间
	 */
					
	private String bisaishijian;
	
	/**
	 * 比赛地点
	 */
					
	private String bisaididian;
	
	/**
	 * 报名人数
	 */
					
	private Integer baomingrenshu;
	
	/**
	 * 比赛要求
	 */
					
	private String bisaiyaoqiu;
	
	/**
	 * 比赛内容
	 */
					
	private String bisaineirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：比赛名称
	 */
	public void setBisaimingcheng(String bisaimingcheng) {
		this.bisaimingcheng = bisaimingcheng;
	}
	/**
	 * 获取：比赛名称
	 */
	public String getBisaimingcheng() {
		return bisaimingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：比赛日期
	 */
	public void setBisairiqi(Date bisairiqi) {
		this.bisairiqi = bisairiqi;
	}
	/**
	 * 获取：比赛日期
	 */
	public Date getBisairiqi() {
		return bisairiqi;
	}
	/**
	 * 设置：比赛时间
	 */
	public void setBisaishijian(String bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	/**
	 * 获取：比赛时间
	 */
	public String getBisaishijian() {
		return bisaishijian;
	}
	/**
	 * 设置：比赛地点
	 */
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
	/**
	 * 设置：报名人数
	 */
	public void setBaomingrenshu(Integer baomingrenshu) {
		this.baomingrenshu = baomingrenshu;
	}
	/**
	 * 获取：报名人数
	 */
	public Integer getBaomingrenshu() {
		return baomingrenshu;
	}
	/**
	 * 设置：比赛要求
	 */
	public void setBisaiyaoqiu(String bisaiyaoqiu) {
		this.bisaiyaoqiu = bisaiyaoqiu;
	}
	/**
	 * 获取：比赛要求
	 */
	public String getBisaiyaoqiu() {
		return bisaiyaoqiu;
	}
	/**
	 * 设置：比赛内容
	 */
	public void setBisaineirong(String bisaineirong) {
		this.bisaineirong = bisaineirong;
	}
	/**
	 * 获取：比赛内容
	 */
	public String getBisaineirong() {
		return bisaineirong;
	}

}
