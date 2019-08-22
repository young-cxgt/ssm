package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/10
 */
@Data
public class Statistics implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
//    private String uid;// 用户ID
//    private String usrname;// 用户名
    private Integer sid;// 站点ID
    private String sname;// 站点名称
    private String fid;// 站点标识fid
    private String seriesId;// 系列id
    private String seriesName;// 系列名称
    private Integer click;// pc端点击量
    private Integer mobileClick;// 移动端点击量
    private Date insertTime;// 插入时间
    private Float score;// 评分
    private Integer scoreNum;// 评分次数
    private Integer status;// 状态 1可用 0失效
    private Integer repository;// 包库编号

    @TableField(exist = false)
    private Integer count;// 观看总次数
    @TableField(exist = false)
    private Integer watchTime;// 统计系列播放时间

}
