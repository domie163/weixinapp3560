package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuizhangView;


/**
 * 队长
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface DuizhangService extends IService<DuizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuizhangVO> selectListVO(Wrapper<DuizhangEntity> wrapper);
   	
   	DuizhangVO selectVO(@Param("ew") Wrapper<DuizhangEntity> wrapper);
   	
   	List<DuizhangView> selectListView(Wrapper<DuizhangEntity> wrapper);
   	
   	DuizhangView selectView(@Param("ew") Wrapper<DuizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuizhangEntity> wrapper);
   	
}

