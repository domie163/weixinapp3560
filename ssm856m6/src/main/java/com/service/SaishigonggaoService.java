package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishigonggaoView;


/**
 * 赛事公告
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface SaishigonggaoService extends IService<SaishigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishigonggaoVO> selectListVO(Wrapper<SaishigonggaoEntity> wrapper);
   	
   	SaishigonggaoVO selectVO(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
   	
   	List<SaishigonggaoView> selectListView(Wrapper<SaishigonggaoEntity> wrapper);
   	
   	SaishigonggaoView selectView(@Param("ew") Wrapper<SaishigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishigonggaoEntity> wrapper);
   	
}

