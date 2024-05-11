package com.entity.vo;

import com.entity.SaishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 赛事信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 21:25:05
 */
public class SaishixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 比赛日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
