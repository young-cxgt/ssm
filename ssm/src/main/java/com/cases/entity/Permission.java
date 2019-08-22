package com.cases.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Auther: young
 * @Date: 2019/1/16 18:17
 * @Description:
 */
@Data
public class Permission implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    /**
     * 状态
     */
    private int status;
    /**
     * 排序
     */
    private int sort;
    /**
     * 级别
     */
    private int level;
    /**
     * logo
     */
    private String logo;
    /**
     * 名稱
     */
    private String name;
    /**
     * 代码
     */
    private String code;
    /**
     * 类型（菜单/按钮）
     */
    private String type;
    /**
     * 地址
     */
    private String url;
    /**
     * 父级ID
     */
    private int pid;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime; // 插入时间

    private String rel;// dwz框架navtab识别标识

    /**
     * 子级菜单
     */
    @TableField(exist = false)
    private List<Permission> ch;
}
