package com.dao;

import com.entity.SaishigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishigonggaoVO;
import com.entity.view.SaishigonggaoView;


/**
 * 赛事公告
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface SaishigonggaoDao extends BaseMapper<SaishigonggaoEntity> {
	
	List<SaishigonggaoVO> selectListVO(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
	
	SaishigonggaoVO selectVO(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
	
	List<SaishigonggaoView> selectListView(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);

	List<SaishigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
	
	SaishigonggaoView selectView(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
	
}
