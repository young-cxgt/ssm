package com.cases.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 日志类型(INFO,ERROR)
     */
    private String type;
    /**
     * ip
     */
    private String ip;
    /**
     * 是否为管理员
     */
    private Integer userId;
    /**
     * 模块
     */
    private String module;
    /**
     * 描述
     */
    private String description;
    /**
     * 类名
     */
    private String className;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 参数
     */
    private String param;
    /**
     * 返回值
     */
    private String result;
    /**
     * 开始时间
     */
    private Date beginTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 执行时长
     */
    private Integer excuteTime;
    /**
     * 异常名
     */
    private String exception;
    /**
     * 异常内容
     */
    private String exceptionContent;
    /**
     * 创建时间
     */
    private Date insertTime;

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", type=" + type +
                ", ip=" + ip +
                ", userId=" + userId +
                ", module=" + module +
                ", description=" + description +
                ", className=" + className +
                ", methodName=" + methodName +
                ", param=" + param +
                ", result=" + result +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", excuteTime=" + excuteTime +
                ", exception=" + exception +
                ", exceptionContent=" + exceptionContent +
                ", insertTime=" + insertTime +
                "}";
    }
}
