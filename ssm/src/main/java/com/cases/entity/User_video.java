package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class User_video implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer videoId;// 视频主键
    private String videoName;// 视频名称
    private String userId;// 用户ID
    private String username;// 用户名
    private Integer watchTime;// 观看时间
    private Integer click;// pc端点击量
    private Integer mobileClick;// 移动端点击量
    private Integer wechatClick;// 微信端点击量
    private String seriesId;// 父类id
    private String seriesName;// 系列名称
    private Integer sid;// 站点ID
    private String siteName;// 站点名称
    private Date insertTime;// 插入时间
    private Integer status;// 状态 1可用 0失效

}
