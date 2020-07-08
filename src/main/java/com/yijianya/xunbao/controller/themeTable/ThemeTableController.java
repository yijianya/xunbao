package com.yijianya.xunbao.controller.themeTable;

import com.yijianya.xunbao.controller.common.BaseController;
import com.yijianya.xunbao.domain.AddThemeTableVo;
import com.yijianya.xunbao.service.ThemeTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by 88400091 on 2018/11/16.
 */
@RestController
@RequestMapping("/themeTable")
@Api(value = "主题管理",description = "主题管理")
public class ThemeTableController extends BaseController {
    @Resource
    private ThemeTableService themeTableService;

    @ApiOperation(value = "新增主题",notes = "新增主题")
    @PostMapping("/")
    public Object postThemeTable(@RequestBody AddThemeTableVo addThemeTableVo){
        themeTableService.addThemeTable(addThemeTableVo);
        return resultHelper.newSuccessResult();
    }

    @ApiOperation(value = "查询所有主题",notes = "查询所有主题")
    @GetMapping("/")
    public Object getThemeTable(){
        return resultHelper.newSuccessResult(themeTableService.query());
    }
}
