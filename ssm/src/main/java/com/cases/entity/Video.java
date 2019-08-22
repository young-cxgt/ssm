package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
@Data
public class Video implements Serializable {

    @TableId(value = "video_id",type = IdType.INPUT)
    private Integer videoId;
    private String videoIntro;//视频简介
    private String videoName;//视频名
    private Integer videoTime;//视频时长
    private String videoUrl;// 视频外链地址
    private String objectId;//上传视频返回的objectId
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;//视频创建时间
    private Integer innerId;//视频系列内ID
    private String keyword;//关键词
    private String seriesId;//系列ID
    private String seriesName;//系列名
    private String teacherId;//教师ID
    private Integer status;//1 视频可用 0 下架
    private String comeFrom;//是否是第三方视频
    private Integer isOpen;//是否开放 1位开放 0 不开放
    private String coverUrl;//封面
    private String captionsUrl;// 字幕地址
    private Integer repository;// 包库序号
    private Integer drag;// 是否可以拖拽 0不可以 1可以
    @TableField(exist = false)
    private Teacher teacher;

}
