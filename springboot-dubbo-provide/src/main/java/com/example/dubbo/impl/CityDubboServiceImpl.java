package com.example.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.domain.City;
import com.example.dubbo.service.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 * @author leolius on 2018-3-23.
 */

@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
    @Override
    public City findCityByName(String cityName) {
        // TODO
        return new City(1L,2L,"南县","是我的故乡");
    }
}
