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
public class Cate implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;// 分类名称
    private String logo;// logo
    private String code;// 分类标识
    private String intro;
    private Integer sid;// 站点ID
    private String sname;// 站点名称
    private Integer status;// 状态
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;// 插入时间
    private Integer level;// 分类级别
    private Integer dimension;// 类型
    private String pcode;// 父类id
    private String pname;// 父类名称
    private String p1code;// 父类id
    private String p1name;// 父类名称
    private String p2code;// 父类id
    private String p2name;// 父类名称
    private Integer repository;// 包库序号
    private Integer sortNum;// 排序字段
    @TableField(exist = false)
    private List<Cate> children;// 子级分类

}
