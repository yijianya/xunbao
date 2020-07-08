package com.yijianya.xunbao.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by 88400091 on 2018/11/16.
 */
@Data
public class AddThemeTableVo {
    @NotNull(message = "主题类型不能为空")
    @ApiModelProperty(value = "主题类型", example = "1",required = true)    //交易类型1：出售,2：求购,3：表情墙
    private Short type;

    @NotBlank(message = "内容不是为空")
    @ApiModelProperty(value = "内容", example = "求购笔记本",required = true)
    private String content;

    @ApiModelProperty(value = "图片1", example = "url1",required = true)
    private String picUrl1;

    @ApiModelProperty(value = "图片2", example = "url2",required = true)
    private String picUrl2;

    @ApiModelProperty(value = "图片3", example = "url3",required = true)
    private String picUrl3;

}
