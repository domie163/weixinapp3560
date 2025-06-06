package com.dao;

import com.entity.QiuduixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuduixinxiVO;
import com.entity.view.QiuduixinxiView;


/**
 * 球队信息
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface QiuduixinxiDao extends BaseMapper<QiuduixinxiEntity> {
	
	List<QiuduixinxiVO> selectListVO(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
	
	QiuduixinxiVO selectVO(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
	
	List<QiuduixinxiView> selectListView(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);

	List<QiuduixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
	
	QiuduixinxiView selectView(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
	
}
