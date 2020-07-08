package com.yijianya.xunbao.service.base;

import com.yijianya.xunbao.dao.mybatis.mapper.base.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<D extends BaseMapper> implements BaseService {
    @Autowired
    protected D dao;

}
