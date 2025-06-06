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


import com.dao.SaishijijinDao;
import com.entity.SaishijijinEntity;
import com.service.SaishijijinService;
import com.entity.vo.SaishijijinVO;
import com.entity.view.SaishijijinView;

@Service("saishijijinService")
public class SaishijijinServiceImpl extends ServiceImpl<SaishijijinDao, SaishijijinEntity> implements SaishijijinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishijijinEntity> page = this.selectPage(
                new Query<SaishijijinEntity>(params).getPage(),
                new EntityWrapper<SaishijijinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishijijinEntity> wrapper) {
		  Page<SaishijijinView> page =new Query<SaishijijinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishijijinVO> selectListVO(Wrapper<SaishijijinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishijijinVO selectVO(Wrapper<SaishijijinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishijijinView> selectListView(Wrapper<SaishijijinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishijijinView selectView(Wrapper<SaishijijinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
