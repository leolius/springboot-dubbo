package com.example.dubbo.service;

import com.example.dubbo.domain.City;

/**
 * 城市业务 Dubbo 服务层
 * Created by leolius on 2018-3-23.
 */
public interface CityDubboService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName 城市名称
     * @return
     */
    City findCityByName(String cityName);
}
