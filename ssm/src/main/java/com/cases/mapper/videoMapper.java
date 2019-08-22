package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cases.entity.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
public interface videoMapper extends BaseMapper<Video> {

    //public List<Video> selectVideoListPage(Pagination page, EntityWrapper entityWrapper);

    public List<Map<String,Object>> selectVideoListMap(@Param("sid") Integer sid);
}
