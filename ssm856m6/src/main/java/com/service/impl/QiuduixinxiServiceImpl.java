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


import com.dao.QiuduixinxiDao;
import com.entity.QiuduixinxiEntity;
import com.service.QiuduixinxiService;
import com.entity.vo.QiuduixinxiVO;
import com.entity.view.QiuduixinxiView;

@Service("qiuduixinxiService")
public class QiuduixinxiServiceImpl extends ServiceImpl<QiuduixinxiDao, QiuduixinxiEntity> implements QiuduixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuduixinxiEntity> page = this.selectPage(
                new Query<QiuduixinxiEntity>(params).getPage(),
                new EntityWrapper<QiuduixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuduixinxiEntity> wrapper) {
		  Page<QiuduixinxiView> page =new Query<QiuduixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuduixinxiVO> selectListVO(Wrapper<QiuduixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuduixinxiVO selectVO(Wrapper<QiuduixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuduixinxiView> selectListView(Wrapper<QiuduixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuduixinxiView selectView(Wrapper<QiuduixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
