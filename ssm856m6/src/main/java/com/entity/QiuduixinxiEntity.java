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
 * 球队信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
@TableName("qiuduixinxi")
public class QiuduixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuduixinxiEntity() {
		
	}
	
	public QiuduixinxiEntity(T t) {
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
	 * 球队名称
	 */
					
	private String qiuduimingcheng;
	
	/**
	 * 球队封面
	 */
					
	private String qiuduifengmian;
	
	/**
	 * 成立时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：球队名称
	 */
	public void setQiuduimingcheng(String qiuduimingcheng) {
		this.qiuduimingcheng = qiuduimingcheng;
	}
	/**
	 * 获取：球队名称
	 */
	public String getQiuduimingcheng() {
		return qiuduimingcheng;
	}
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
