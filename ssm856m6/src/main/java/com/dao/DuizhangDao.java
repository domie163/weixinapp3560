package com.dao;

import com.entity.DuizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuizhangVO;
import com.entity.view.DuizhangView;


/**
 * 队长
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface DuizhangDao extends BaseMapper<DuizhangEntity> {
	
	List<DuizhangVO> selectListVO(@Param("ew") Wrapper<DuizhangEntity> wrapper);
	
	DuizhangVO selectVO(@Param("ew") Wrapper<DuizhangEntity> wrapper);
	
	List<DuizhangView> selectListView(@Param("ew") Wrapper<DuizhangEntity> wrapper);

	List<DuizhangView> selectListView(Pagination page,@Param("ew") Wrapper<DuizhangEntity> wrapper);
	
	DuizhangView selectView(@Param("ew") Wrapper<DuizhangEntity> wrapper);
	
}
