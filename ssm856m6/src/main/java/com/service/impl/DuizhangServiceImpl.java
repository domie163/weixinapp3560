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


import com.dao.DuizhangDao;
import com.entity.DuizhangEntity;
import com.service.DuizhangService;
import com.entity.vo.DuizhangVO;
import com.entity.view.DuizhangView;

@Service("duizhangService")
public class DuizhangServiceImpl extends ServiceImpl<DuizhangDao, DuizhangEntity> implements DuizhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuizhangEntity> page = this.selectPage(
                new Query<DuizhangEntity>(params).getPage(),
                new EntityWrapper<DuizhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuizhangEntity> wrapper) {
		  Page<DuizhangView> page =new Query<DuizhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuizhangVO> selectListVO(Wrapper<DuizhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuizhangVO selectVO(Wrapper<DuizhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuizhangView> selectListView(Wrapper<DuizhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuizhangView selectView(Wrapper<DuizhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
