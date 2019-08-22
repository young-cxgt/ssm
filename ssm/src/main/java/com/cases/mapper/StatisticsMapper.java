package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.Statistics;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/6/3
 */
public interface StatisticsMapper extends BaseMapper<Statistics> {

    Statistics getStatisClick(@Param("id") String id, @Param("sid") int sid);

    List<Map<String,Object>> selectSeriesMapList(int sid);

    List<Statistics> selectSeriesStatistics(Page page, @Param("sid") int sid);

    Integer getSeriesClicks(@Param("sid") int sid);
}
