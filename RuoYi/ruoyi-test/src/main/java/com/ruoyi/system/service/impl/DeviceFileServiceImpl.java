package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DeviceFileMapper;
import com.ruoyi.system.domain.DeviceFile;
import com.ruoyi.system.service.IDeviceFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * deviceService业务层处理
 * 
 * @author java
 * @date 2024-11-24
 */
@Service
public class DeviceFileServiceImpl implements IDeviceFileService 
{
    @Autowired
    private DeviceFileMapper deviceFileMapper;

    /**
     * 查询device
     * 
     * @param id device主键
     * @return device
     */
    @Override
    public DeviceFile selectDeviceFileById(Long id)
    {
        return deviceFileMapper.selectDeviceFileById(id);
    }

    /**
     * 查询device列表
     * 
     * @param deviceFile device
     * @return device
     */
    @Override
    public List<DeviceFile> selectDeviceFileList(DeviceFile deviceFile)
    {
        return deviceFileMapper.selectDeviceFileList(deviceFile);
    }

    /**
     * 新增device
     * 
     * @param deviceFile device
     * @return 结果
     */
    @Override
    public int insertDeviceFile(DeviceFile deviceFile)
    {
        deviceFile.setCreateTime(DateUtils.getNowDate());
        return deviceFileMapper.insertDeviceFile(deviceFile);
    }

    /**
     * 修改device
     * 
     * @param deviceFile device
     * @return 结果
     */
    @Override
    public int updateDeviceFile(DeviceFile deviceFile)
    {
        return deviceFileMapper.updateDeviceFile(deviceFile);
    }

    /**
     * 批量删除device
     * 
     * @param ids 需要删除的device主键
     * @return 结果
     */
    @Override
    public int deleteDeviceFileByIds(String ids)
    {
        return deviceFileMapper.deleteDeviceFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除device信息
     * 
     * @param id device主键
     * @return 结果
     */
    @Override
    public int deleteDeviceFileById(Long id)
    {
        return deviceFileMapper.deleteDeviceFileById(id);
    }
}
