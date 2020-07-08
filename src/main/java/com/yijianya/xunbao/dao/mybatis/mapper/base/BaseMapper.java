package com.yijianya.xunbao.dao.mybatis.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * mybatis所有Mapper的基础接口，该接口定义了基本的CRUD操作，其他个性化的操作请在具体的Mapper接口中定义
 * @author TanJH
 * 2018-02-11创建
 *
 * @param <ID> 主键类型
 * @param <MODEL> Model类型
 * @param <EXAMPLE> Example类型
 */
public interface BaseMapper<ID,MODEL,EXAMPLE> {
    /**基本操作**/

    long countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(ID id);

    int insert(MODEL record);

    int insertSelective(MODEL record);

    List<MODEL> selectByExample(EXAMPLE example);

    MODEL selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") MODEL record, @Param("example") EXAMPLE example);

    int updateByExample(@Param("record") MODEL record, @Param("example") EXAMPLE example);

    int updateByPrimaryKeySelective(MODEL record);

    int updateByPrimaryKey(MODEL record);


    /** BLOB相关字段操作 **/

    /*int insert(UserListViewWithBLOBs record);

    int insertSelective(UserListViewWithBLOBs record);

    List<UserListViewWithBLOBs> selectByExampleWithBLOBs(UserListViewExample example);

    int updateByExampleSelective(@Param("record") UserListViewWithBLOBs record, @Param("example") UserListViewExample example);

    int updateByExampleWithBLOBs(@Param("record") UserListViewWithBLOBs record, @Param("example") UserListViewExample example);*/
}
