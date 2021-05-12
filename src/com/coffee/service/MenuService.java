package com.coffee.service;

import com.coffee.mapper.MenuMapper;
import com.coffee.pojo.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {

    @Resource
    private MenuMapper menuMapper;
    public List<Menu> show(){
        return menuMapper.selByLevel(0);
    }
}
