package com.entity.model;

import com.entity.QiuduixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 球队信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public class QiuduixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 球队封面
	 */
	
	private String qiuduifengmian;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 队长账号
	 */
	
	private String duizhangzhanghao;
		
	/**
	 * 队长姓名
	 */
	
	private String duizhangxingming;
		
	/**
	 * 球队成员
	 */
	
	private String qiuduichengyuan;
		
	/**
	 * 球队介绍
	 */
	
	private String qiuduijieshao;
				
	
	/**
	 * 设置：球队封面
	 */
	 
	public void setQiuduifengmian(String qiuduifengmian) {
		this.qiuduifengmian = qiuduifengmian;
	}
	
	/**
	 * 获取：球队封面
	 */
	public String getQiuduifengmian() {
		return qiuduifengmian;
	}
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
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
	 * 设置：球队成员
	 */
	 
	public void setQiuduichengyuan(String qiuduichengyuan) {
		this.qiuduichengyuan = qiuduichengyuan;
	}
	
	/**
	 * 获取：球队成员
	 */
	public String getQiuduichengyuan() {
		return qiuduichengyuan;
	}
				
	
	/**
	 * 设置：球队介绍
	 */
	 
	public void setQiuduijieshao(String qiuduijieshao) {
		this.qiuduijieshao = qiuduijieshao;
	}
	
	/**
	 * 获取：球队介绍
	 */
	public String getQiuduijieshao() {
		return qiuduijieshao;
	}
			
}
