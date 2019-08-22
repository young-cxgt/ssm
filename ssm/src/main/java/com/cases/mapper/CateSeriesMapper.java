package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.Cate_series;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
public interface CateSeriesMapper extends BaseMapper<Cate_series> {


    List<Cate_series> selectCateSeriesListOrder(Page page, @Param("cate_code") String cate_code, @Param("sort") int sort, @Param("sid") int sid, @Param("repository") int repository);

    List<Cate_series> selectSeriesGroupByCode(@Param("sid") int sid, @Param("repository") int repository, @Param("searchValue") String searchValue);

    List<Cate_series> selectSeriesByCateCode(Page page, @Param("sid") int sid, @Param("repository") int repository, @Param("cateCode") String cateCode);

    List<Cate_series> selectCateSeriesBySw(Page page, @Param("sid") int sid, @Param("repository") int repository, @Param("searchValue") String searchValue, @Param("code") String code, @Param("sort") int sort);
}
