package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.io.Serializable;

/**
 * @Auther: young
 * @Date: 2019/1/16 18:24
 * @Description:
 */
@Data
public class Role implements Serializable {
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
     * 代码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 站点ID
     */
    private int siteId;


}

