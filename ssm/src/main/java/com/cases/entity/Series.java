package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
@Data
public class Series implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String coverUrl;//封面图片
    private String seriesId;//系列ID
    private String seriesName;//系列名
    private String seriesIntro;//系列简介
    private Integer seriesSize;//系列集数
    private Integer seriesTime;//系列时长
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;//更新时间
    private String seriesDone;//是否完成（可选值为：NULL，本系列完）
    private String linkUrl;// 第三方视频链接地址
    private Integer status;//上下架状态 1 0
    private Integer isOpen;//是否开放 1位开放 0 不开放
    private Integer isVip;//是否是VIP课程
    private Integer vipScore;//vip课程分数
    private String labels;//标签(用于模糊查询，例如&labels=”马克思”，将会查出来名字里包含“马克思”的所有信息)
    private String comeFrom;//来源
    private String teacherId;//教师编号
    private String teacherName;//老师名称
    private int click;// 播放次数
    private int mobileClick;//移动端点击量
    private float score;// 评分
    private int scoreNum;// 评分次数
    private String firstSubjectNo;//第一学科学科号
    private String firstSubjectName;//第一学科学科名
    private String secondSubjectNo;//第二学科学科号
    private String secondSubjectName;//第二学科学科名
    private String thirdSubjectNo;//第三学科学科号
    private String thirdSubjectName;//第三学科学科名
    private String forthSubjectNo;//第四学科学科号
    private String forthSubjectName;//第四学科学科名
    private Integer hasExam;// 是否有考试功能

    @TableField(exist = false)
    private List<Video> videos;
    @TableField(exist = false)
    private Teacher teacher;
    @TableField(exist = false)
    private Statistics statistics;// 关联统计实体类
    @TableField(exist = false)
    private Float statis_score;// 统计评分
    @TableField(exist = false)
    private Integer statis_score_num;// 统计评分次数
}
