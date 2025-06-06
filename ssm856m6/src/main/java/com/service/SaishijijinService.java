package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishijijinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishijijinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishijijinView;


/**
 * 赛事集锦
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface SaishijijinService extends IService<SaishijijinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishijijinVO> selectListVO(Wrapper<SaishijijinEntity> wrapper);
   	
   	SaishijijinVO selectVO(@Param("ew") Wrapper<SaishijijinEntity> wrapper);
   	
   	List<SaishijijinView> selectListView(Wrapper<SaishijijinEntity> wrapper);
   	
   	SaishijijinView selectView(@Param("ew") Wrapper<SaishijijinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishijijinEntity> wrapper);
   	
}

