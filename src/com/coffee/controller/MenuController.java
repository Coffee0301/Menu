package com.coffee.controller;

import com.coffee.pojo.Menu;
import com.coffee.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    /*spring mvc 容器调用spring容器中的内容，子容器调用父容器*/
    @Resource
    private MenuService menuService;

    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show(){
        return menuService.show();
    }
}