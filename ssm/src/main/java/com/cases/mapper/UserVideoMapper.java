package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.User_video;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/6/3
 */
public interface UserVideoMapper extends BaseMapper<User_video> {

    List<User_video> selectUserVideoList(Page page, @Param("sid") Integer sid, @Param("videoName") String videoName, @Param("seriesName") String seriesName);

    List<User_video> selectUserCountList(Page page, @Param("sid") Integer sid, @Param("userId") String userId);

    List<Map<String,Object>> selectUserVideoListMap(@Param("sid") Integer sid);
}
