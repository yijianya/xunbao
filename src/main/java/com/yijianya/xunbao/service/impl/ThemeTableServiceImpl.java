package com.yijianya.xunbao.service.impl;

import com.yijianya.xunbao.dao.mybatis.mapper.xunbao.ThemeTableMapper;
import com.yijianya.xunbao.dao.mybatis.model.ThemeTable;
import com.yijianya.xunbao.dao.mybatis.model.ThemeTableExample;
import com.yijianya.xunbao.domain.AddThemeTableVo;
import com.yijianya.xunbao.service.ThemeTableService;
import com.yijianya.xunbao.service.base.BaseServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by 88400091 on 2018/11/15.
 */
@Service
@Transactional
public class ThemeTableServiceImpl extends BaseServiceImpl<ThemeTableMapper> implements ThemeTableService {

    @Override
    public void addThemeTable(AddThemeTableVo addThemeTableVo) {
        ThemeTable themeTable = new ThemeTable();
        BeanUtils.copyProperties(addThemeTableVo,themeTable);
        themeTable.setCreateDate(new Date());
        themeTable.setCreator("system");
        themeTable.setUpdateDate(new Date());
        themeTable.setUpdater("admin");
        themeTable.setVersion(1);
        dao.insert(themeTable);
    }

    @Override
    public List<ThemeTable> query() {
        ThemeTableExample themeTableExample = new ThemeTableExample();
        return dao.selectByExample(themeTableExample);
    }


}
