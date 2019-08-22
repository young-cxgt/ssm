package com.cases.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 等级
     */
    private Integer lv;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * email
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 单位
     */
    private String company;
    /**
     * 名称
     */
    private String name;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;
    /**
     * 创建时间ms值
     */
    private Long insertTimeMs;
    /**
     * uid
     */
    private Integer uid;
    /**
     * 站点id
     */
    private Integer siteId;

    public User(Integer id, Integer status, Integer sort, Integer lv, String username, String password, String email, String phone, String company, String name, Date updateTime, Date insertTime, Long insertTimeMs, Integer uid, Integer siteId) {
        this.id = id;
        this.status = status;
        this.sort = sort;
        this.lv = lv;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.name = name;
        this.updateTime = updateTime;
        this.insertTime = insertTime;
        this.insertTimeMs = insertTimeMs;
        this.uid = uid;
        this.siteId = siteId;
    }
}
