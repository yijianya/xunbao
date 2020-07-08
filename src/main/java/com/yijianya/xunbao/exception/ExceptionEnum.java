package com.yijianya.xunbao.exception;

/**
 * 异常枚举类
 */
public enum ExceptionEnum {

    /**
     * 系统繁忙
     */
    err_system_busy,

    /**
     * 知识库导入记录数超过限制
     */
    err_knowledge_base_rows_exceed_import_limit,

    /**
     * 知识库导入失败
     */
    err_knowledge_base_import_fail,

    /**
     * 知识库主题不能为空
     */
    err_knowledge_base_title_can_not_be_null,

    /**
     * 知识库内容不能为空
     */
    err_knowledge_base_content_can_not_be_null,

    /**
     * 知识库导入时每条不能为空
     */
    err_knowledge_base_import_rows_can_not_be_null,

    /**
     * 日期格式有误
     */
    err_customer_service_qgent_4elation_wrong_Date,

    /**
     * 已有同名標題
     */
    err_knowledge_base_insert_name,

    /**
     * 代理人和客服不能为同一人
     */
    err_customer_service_qgent_relation_wrong_relation,

    /**
     *    不能删除别人的知识库
      */
    err_knowledge_no_authority;
}
