package com.dao;

import com.entity.SaishijijinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishijijinVO;
import com.entity.view.SaishijijinView;


/**
 * 赛事集锦
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface SaishijijinDao extends BaseMapper<SaishijijinEntity> {
	
	List<SaishijijinVO> selectListVO(@Param("ew") Wrapper<SaishijijinEntity> wrapper);
	
	SaishijijinVO selectVO(@Param("ew") Wrapper<SaishijijinEntity> wrapper);
	
	List<SaishijijinView> selectListView(@Param("ew") Wrapper<SaishijijinEntity> wrapper);

	List<SaishijijinView> selectListView(Pagination page,@Param("ew") Wrapper<SaishijijinEntity> wrapper);
	
	SaishijijinView selectView(@Param("ew") Wrapper<SaishijijinEntity> wrapper);
	
}
