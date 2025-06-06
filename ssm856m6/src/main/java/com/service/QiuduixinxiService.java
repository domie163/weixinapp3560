package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuduixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuduixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuduixinxiView;


/**
 * 球队信息
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:30
 */
public interface QiuduixinxiService extends IService<QiuduixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuduixinxiVO> selectListVO(Wrapper<QiuduixinxiEntity> wrapper);
   	
   	QiuduixinxiVO selectVO(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
   	
   	List<QiuduixinxiView> selectListView(Wrapper<QiuduixinxiEntity> wrapper);
   	
   	QiuduixinxiView selectView(@Param("ew") Wrapper<QiuduixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuduixinxiEntity> wrapper);
   	
}

