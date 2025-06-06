package com.dao;

import com.entity.DiscusssaishijijinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssaishijijinVO;
import com.entity.view.DiscusssaishijijinView;


/**
 * 赛事集锦评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface DiscusssaishijijinDao extends BaseMapper<DiscusssaishijijinEntity> {
	
	List<DiscusssaishijijinVO> selectListVO(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
	
	DiscusssaishijijinVO selectVO(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
	
	List<DiscusssaishijijinView> selectListView(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);

	List<DiscusssaishijijinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
	
	DiscusssaishijijinView selectView(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
	
}
