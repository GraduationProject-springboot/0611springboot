package com.entity.vo;

import com.entity.QuxiaobaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 取消报名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-19 12:40:35
 */
public class QuxiaobaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fuwushijian;
		
	/**
	 * 服务时长
	 */
	
	private String fuwushizhang;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 取消时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date quxiaoshijian;
		
	/**
	 * 取消原因
	 */
	
	private String quxiaoyuanyin;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：服务时间
	 */
	 
	public void setFuwushijian(Date fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	
	/**
	 * 获取：服务时间
	 */
	public Date getFuwushijian() {
		return fuwushijian;
	}
				
	
	/**
	 * 设置：服务时长
	 */
	 
	public void setFuwushizhang(String fuwushizhang) {
		this.fuwushizhang = fuwushizhang;
	}
	
	/**
	 * 获取：服务时长
	 */
	public String getFuwushizhang() {
		return fuwushizhang;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：志愿者账号
	 */
	 
	public void setZhiyuanzhezhanghao(String zhiyuanzhezhanghao) {
		this.zhiyuanzhezhanghao = zhiyuanzhezhanghao;
	}
	
	/**
	 * 获取：志愿者账号
	 */
	public String getZhiyuanzhezhanghao() {
		return zhiyuanzhezhanghao;
	}
				
	
	/**
	 * 设置：志愿者姓名
	 */
	 
	public void setZhiyuanzhexingming(String zhiyuanzhexingming) {
		this.zhiyuanzhexingming = zhiyuanzhexingming;
	}
	
	/**
	 * 获取：志愿者姓名
	 */
	public String getZhiyuanzhexingming() {
		return zhiyuanzhexingming;
	}
				
	
	/**
	 * 设置：取消时间
	 */
	 
	public void setQuxiaoshijian(Date quxiaoshijian) {
		this.quxiaoshijian = quxiaoshijian;
	}
	
	/**
	 * 获取：取消时间
	 */
	public Date getQuxiaoshijian() {
		return quxiaoshijian;
	}
				
	
	/**
	 * 设置：取消原因
	 */
	 
	public void setQuxiaoyuanyin(String quxiaoyuanyin) {
		this.quxiaoyuanyin = quxiaoyuanyin;
	}
	
	/**
	 * 获取：取消原因
	 */
	public String getQuxiaoyuanyin() {
		return quxiaoyuanyin;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
