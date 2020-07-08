package com.yijianya.xunbao.service;

import com.yijianya.xunbao.dao.mybatis.model.ThemeTable;
import com.yijianya.xunbao.domain.AddThemeTableVo;
import com.yijianya.xunbao.service.base.BaseService;

import java.util.List;

/**
 * Created by 88400091 on 2018/11/15.
 */

public interface ThemeTableService extends BaseService {
    /**
     * 新增主题
     * @param addThemeTableVo 主题内容
     */
    void addThemeTable(AddThemeTableVo addThemeTableVo);

    List<ThemeTable> query();
}
