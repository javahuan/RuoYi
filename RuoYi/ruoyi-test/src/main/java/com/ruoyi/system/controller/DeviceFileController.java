package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DeviceFile;
import com.ruoyi.system.service.IDeviceFileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * deviceController
 * 
 * @author java
 * @date 2024-11-24
 */
@Controller
@RequestMapping("/system/device")
public class DeviceFileController extends BaseController
{
    private String prefix = "system/device";

    @Autowired
    private IDeviceFileService deviceFileService;

    @RequiresPermissions("system:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询device列表
     */
    @RequiresPermissions("system:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceFile deviceFile)
    {
        startPage();
        List<DeviceFile> list = deviceFileService.selectDeviceFileList(deviceFile);
        return getDataTable(list);
    }

    /**
     * 导出device列表
     */
    @RequiresPermissions("system:device:export")
    @Log(title = "device", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceFile deviceFile)
    {
        List<DeviceFile> list = deviceFileService.selectDeviceFileList(deviceFile);
        ExcelUtil<DeviceFile> util = new ExcelUtil<DeviceFile>(DeviceFile.class);
        return util.exportExcel(list, "device数据");
    }

    /**
     * 新增device
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存device
     */
    @RequiresPermissions("system:device:add")
    @Log(title = "device", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceFile deviceFile)
    {
        return toAjax(deviceFileService.insertDeviceFile(deviceFile));
    }

    /**
     * 修改device
     */
    @RequiresPermissions("system:device:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DeviceFile deviceFile = deviceFileService.selectDeviceFileById(id);
        mmap.put("deviceFile", deviceFile);
        return prefix + "/edit";
    }

    /**
     * 修改保存device
     */
    @RequiresPermissions("system:device:edit")
    @Log(title = "device", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceFile deviceFile)
    {
        return toAjax(deviceFileService.updateDeviceFile(deviceFile));
    }

    /**
     * 删除device
     */
    @RequiresPermissions("system:device:remove")
    @Log(title = "device", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceFileService.deleteDeviceFileByIds(ids));
    }
}
