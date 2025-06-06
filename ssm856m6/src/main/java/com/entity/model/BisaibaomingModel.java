package com.entity.model;

import com.entity.BisaibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 比赛报名
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public class BisaibaomingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 比赛名称
	 */
	
	private String bisaimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 报名时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 球队选择
	 */
	
	private String qiuduixuanze;
		
	/**
	 * 队长账号
	 */
	
	private String duizhangzhanghao;
		
	/**
	 * 队长姓名
	 */
	
	private String duizhangxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
	 * 设置：报名时间
	 */
	 
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：球队选择
	 */
	 
	public void setQiuduixuanze(String qiuduixuanze) {
		this.qiuduixuanze = qiuduixuanze;
	}
	
	/**
	 * 获取：球队选择
	 */
	public String getQiuduixuanze() {
		return qiuduixuanze;
	}
				
	
	/**
	 * 设置：队长账号
	 */
	 
	public void setDuizhangzhanghao(String duizhangzhanghao) {
		this.duizhangzhanghao = duizhangzhanghao;
	}
	
	/**
	 * 获取：队长账号
	 */
	public String getDuizhangzhanghao() {
		return duizhangzhanghao;
	}
				
	
	/**
	 * 设置：队长姓名
	 */
	 
	public void setDuizhangxingming(String duizhangxingming) {
		this.duizhangxingming = duizhangxingming;
	}
	
	/**
	 * 获取：队长姓名
	 */
	public String getDuizhangxingming() {
		return duizhangxingming;
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
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
