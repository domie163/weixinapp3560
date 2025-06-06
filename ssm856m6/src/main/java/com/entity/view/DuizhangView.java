package com.entity.view;

import com.entity.DuizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 队长
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
@TableName("duizhang")
public class DuizhangView  extends DuizhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuizhangView(){
	}
 
 	public DuizhangView(DuizhangEntity duizhangEntity){
 	try {
			BeanUtils.copyProperties(this, duizhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
