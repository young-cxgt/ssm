package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Cate_series implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String seriesId;
    private String seriesName;
    private Date insertTime;
    private Integer sid;
    private String sname;
    private Integer status;
    private Float score;// 评分
    private Integer scoreNum;// 评分次数
    private String cateCode;//
    private String secondCateCode;//
    private String thirdCateCode; //
    private String forthCateCode; //
    private Integer click; // 电脑点击量
    private Integer mobileClick;// 移动端点击量
    private Integer repository;// 包库序号

    @TableField(exist = false)
    private Series series;
    @TableField(exist = false)
    private Integer statis_click;// PC点击量
    @TableField(exist = false)
    private Integer statis_mobileClick;// 移动端点击量
    @TableField(exist = false)
    private List videos; // 子级视频
}
