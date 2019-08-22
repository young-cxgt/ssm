package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: young
 * @Date: 2019/1/16 18:30
 * @Description:
 */
@Data
public class Site implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;// 主键
    private String name;// 站点名称
    private String fid;// fid
    private String logo;
    private String domain;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;// 插入时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;// 到期時間
    private String tempPath;// 模板路径
    private String intro;// 简介
    private Integer status; // 0失效，1可用，3项目分类，4子站分类，5法源分类，6微服务分类
    private String power;// 权限
    private Integer repository;// 是否采用默认资源 0为不采用包库 其他为包库代号
    private Integer hasMobile;// 是否开通移动端
    private Integer copySite;// 参考站点
    private String custom;// json参数
    private Integer hasPrivate;// 是否有第三方私有资源


}
