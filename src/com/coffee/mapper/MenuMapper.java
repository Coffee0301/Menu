package com.coffee.mapper;

import com.coffee.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    public List<Menu> selByLevel(int level);
}
