package com.entity.view;

import com.entity.DiscusssaishijijinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛事集锦评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
@TableName("discusssaishijijin")
public class DiscusssaishijijinView  extends DiscusssaishijijinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssaishijijinView(){
	}
 
 	public DiscusssaishijijinView(DiscusssaishijijinEntity discusssaishijijinEntity){
 	try {
			BeanUtils.copyProperties(this, discusssaishijijinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
