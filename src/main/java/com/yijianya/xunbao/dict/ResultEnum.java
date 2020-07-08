package com.yijianya.xunbao.dict;

/**
 * Created by Zed on 2018/3/7.
 */
public enum  ResultEnum implements BaseEnum<String, String> {



    //	 -----------------------------------参数错误码------------------//
    PARAMETER_ERR("参数错误或缺失", "20000"),
        ;


    // 字典项的中文名称
    private String name;
    // 字典项的值
    private String value;

    private ResultEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }
    /**
     * 获取label
     *
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 获取值
     *
     * @return
     */
    @Override
    public String getValue() {
        return this.value;
    }

}
