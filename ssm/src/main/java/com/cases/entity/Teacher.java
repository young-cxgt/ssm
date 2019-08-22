package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
@Data
public class Teacher implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String teacherId;// 教师唯一标识
    private String teacherCome;// 教师所属机构
    private String teacherName;// 教师名称
    private String teacherIntro;// 教师简介
    private String teacherPosition;// 教师职称
    private Integer sid;// 站点ID
    private Integer status;// 状态 1可用 0失效
    private String logo;// 教师头像（备用）
}
