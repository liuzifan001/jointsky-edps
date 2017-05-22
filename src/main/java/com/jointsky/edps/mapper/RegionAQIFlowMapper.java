package com.jointsky.edps.mapper;

import com.jointsky.edps.model.RegionAQIFlow;

import java.sql.Date;

/**
 * Created by root on 2017/5/19.
 */
public interface RegionAQIFlowMapper {

    public RegionAQIFlow getAQIFlowByRegionNameDate(String regionName, Date date);
}
