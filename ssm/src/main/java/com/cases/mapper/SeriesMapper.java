package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.Series;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
public interface SeriesMapper extends BaseMapper<Series> {

    @Select("select s.series_id,s.series_name,s.cover_url,s.labels,s.series_size,s.series_time,s.click,s.mobile_click,s.score,s.score_num from cate_series as cs left join series as s on cs.series_id = s.series_id" +
            " where cs.sid = #{sid} and s.labels = #{labels} order by s.click desc")
    List<Series> selectSeriesListByLabel(Page page, @Param("sid") int sid, @Param("labels") String labels);
}