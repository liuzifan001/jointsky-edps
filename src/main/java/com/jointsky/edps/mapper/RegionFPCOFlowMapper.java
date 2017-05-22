package com.jointsky.edps.mapper;

import java.sql.Date;
import java.util.List;

/**
 * Created by root on 2017/5/22.
 */
public interface RegionFPCOFlowMapper {

    public RegionFPCOFlowMapper getFPOCFlowByRegionNameDate(String regionName, Date date);

    public List<RegionFPCOFlowMapper> getFPOCFlowByRegionStartEndDate(String regionName,Date start,Date end);
}
