package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssaishijijinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssaishijijinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssaishijijinView;


/**
 * 赛事集锦评论表
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface DiscusssaishijijinService extends IService<DiscusssaishijijinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssaishijijinVO> selectListVO(Wrapper<DiscusssaishijijinEntity> wrapper);
   	
   	DiscusssaishijijinVO selectVO(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
   	
   	List<DiscusssaishijijinView> selectListView(Wrapper<DiscusssaishijijinEntity> wrapper);
   	
   	DiscusssaishijijinView selectView(@Param("ew") Wrapper<DiscusssaishijijinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssaishijijinEntity> wrapper);
   	
}

