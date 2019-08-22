package com.cases.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cases.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
public interface TeacherMapper extends BaseMapper<Teacher> {

    List<Teacher> selectTeacherList(Page page, @Param("sid") Integer sid, @Param("teacherId") String teacherId, @Param("teacherName") String teacherName);
}
