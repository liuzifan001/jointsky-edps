package com.jointsky.edps.service;

import com.jointsky.edps.mapper.RegionAQIFlowMapper;
import com.jointsky.edps.model.RegionAQIFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * Created by root on 2017/5/19.
 */
@Service
public class RegionAQIFlowService {

    @Autowired
    private RegionAQIFlowMapper regionAQIFlowMapper;

    public RegionAQIFlow getRegionAQIFlow(String regionName, Date date){
        RegionAQIFlow regionAQIFlow = regionAQIFlowMapper.getAQIFlowByRegionNameDate(regionName,date);
        return regionAQIFlow;
    }
}
