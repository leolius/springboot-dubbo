package com.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.domain.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leolius on 2018-3-23.
 */
@RestController
@RequestMapping(value={"","/","/test"})
public class CityDubboConsumerService {
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public CityDubboService getCityDubboService() {
        return cityDubboService;
    }

    public void setCityDubboService(CityDubboService cityDubboService) {
        this.cityDubboService = cityDubboService;
    }
@RequestMapping(value={"/"})
    public void printCity() {
        String cityName = "南县";
        if(cityDubboService == null){
            System.out.println("cityDubboService 服务对象 为空");
        }else{
            System.out.println("cityDubboService 服务对象 不 为空");
        }
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
