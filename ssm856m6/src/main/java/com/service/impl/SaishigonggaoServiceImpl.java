package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SaishigonggaoDao;
import com.entity.SaishigonggaoEntity;
import com.service.SaishigonggaoService;
import com.entity.vo.SaishigonggaoVO;
import com.entity.view.SaishigonggaoView;

@Service("saishigonggaoService")
public class SaishigonggaoServiceImpl extends ServiceImpl<SaishigonggaoDao, SaishigonggaoEntity> implements SaishigonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishigonggaoEntity> page = this.selectPage(
                new Query<SaishigonggaoEntity>(params).getPage(),
                new EntityWrapper<SaishigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishigonggaoEntity> wrapper) {
		  Page<SaishigonggaoView> page =new Query<SaishigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishigonggaoVO> selectListVO(Wrapper<SaishigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishigonggaoVO selectVO(Wrapper<SaishigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishigonggaoView> selectListView(Wrapper<SaishigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishigonggaoView selectView(Wrapper<SaishigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
