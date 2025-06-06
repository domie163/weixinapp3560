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


import com.dao.DiscusssaishijijinDao;
import com.entity.DiscusssaishijijinEntity;
import com.service.DiscusssaishijijinService;
import com.entity.vo.DiscusssaishijijinVO;
import com.entity.view.DiscusssaishijijinView;

@Service("discusssaishijijinService")
public class DiscusssaishijijinServiceImpl extends ServiceImpl<DiscusssaishijijinDao, DiscusssaishijijinEntity> implements DiscusssaishijijinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssaishijijinEntity> page = this.selectPage(
                new Query<DiscusssaishijijinEntity>(params).getPage(),
                new EntityWrapper<DiscusssaishijijinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssaishijijinEntity> wrapper) {
		  Page<DiscusssaishijijinView> page =new Query<DiscusssaishijijinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssaishijijinVO> selectListVO(Wrapper<DiscusssaishijijinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssaishijijinVO selectVO(Wrapper<DiscusssaishijijinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssaishijijinView> selectListView(Wrapper<DiscusssaishijijinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssaishijijinView selectView(Wrapper<DiscusssaishijijinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
