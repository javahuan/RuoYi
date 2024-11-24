package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * device对象 device_file
 * 
 * @author java
 * @date 2024-11-24
 */
public class DeviceFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** parent_id */
    private String parentId;

    /** 设别id */
    @Excel(name = "设别id")
    private String deviceId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设别类型 */
    @Excel(name = "设别类型")
    private String deviceType;

    /** check_tag */
    private Long checkTag;

    /** checker */
    private String checker;

    /** check_time */
    private Date checkTime;

    /** 是否使用 */
    private Integer usedTag;

    /** 创建者id */
    @Excel(name = "创建者id")
    private String creatorId;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setParentId(String parentId) 
    {
        this.parentId = parentId;
    }

    public String getParentId() 
    {
        return parentId;
    }

    public void setDeviceId(String deviceId) 
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }

    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }

    public void setDeviceType(String deviceType) 
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType() 
    {
        return deviceType;
    }

    public void setCheckTag(Long checkTag) 
    {
        this.checkTag = checkTag;
    }

    public Long getCheckTag() 
    {
        return checkTag;
    }

    public void setChecker(String checker) 
    {
        this.checker = checker;
    }

    public String getChecker() 
    {
        return checker;
    }

    public void setCheckTime(Date checkTime) 
    {
        this.checkTime = checkTime;
    }

    public Date getCheckTime() 
    {
        return checkTime;
    }

    public void setUsedTag(Integer usedTag) 
    {
        this.usedTag = usedTag;
    }

    public Integer getUsedTag() 
    {
        return usedTag;
    }

    public void setCreatorId(String creatorId) 
    {
        this.creatorId = creatorId;
    }

    public String getCreatorId() 
    {
        return creatorId;
    }

    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentId", getParentId())
            .append("deviceId", getDeviceId())
            .append("deviceName", getDeviceName())
            .append("deviceType", getDeviceType())
            .append("checkTag", getCheckTag())
            .append("checker", getChecker())
            .append("checkTime", getCheckTime())
            .append("usedTag", getUsedTag())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("createTime", getCreateTime())
            .toString();
    }
}
