package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DeviceFile;

/**
 * deviceMapper接口
 * 
 * @author java
 * @date 2024-11-24
 */
public interface DeviceFileMapper 
{
    /**
     * 查询device
     * 
     * @param id device主键
     * @return device
     */
    public DeviceFile selectDeviceFileById(Long id);

    /**
     * 查询device列表
     * 
     * @param deviceFile device
     * @return device集合
     */
    public List<DeviceFile> selectDeviceFileList(DeviceFile deviceFile);

    /**
     * 新增device
     * 
     * @param deviceFile device
     * @return 结果
     */
    public int insertDeviceFile(DeviceFile deviceFile);

    /**
     * 修改device
     * 
     * @param deviceFile device
     * @return 结果
     */
    public int updateDeviceFile(DeviceFile deviceFile);

    /**
     * 删除device
     * 
     * @param id device主键
     * @return 结果
     */
    public int deleteDeviceFileById(Long id);

    /**
     * 批量删除device
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceFileByIds(String[] ids);
}
