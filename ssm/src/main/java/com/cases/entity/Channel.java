package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: young
 * @Description:
 * @Date: 2019/5/24
 */
@Data
public class Channel implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;// 菜单名称
    private Integer actionType;// 菜单类型
    private String url;// 菜单地址
    private Data insertTime;// 创建时间
    private String intro;// 简介
    private String logo;
    private Integer sortNum;// 排序
    private Integer status;// 状态
    private Integer pid;// 父类id
    private String pname;// 父类名称
    private Integer siteId;// 站点ID
    private String site_name;// 站点名称
    private String custom;// json串

    @TableField(exist = false)
    private List<Channel> ch;
}
