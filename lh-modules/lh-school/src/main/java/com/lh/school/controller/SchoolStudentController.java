package com.lh.school.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.lh.school.domain.SchoolStudent;
import com.lh.school.service.ISchoolStudentService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 学生Controller
 * 
 * @author lh
 * @date 2022-04-24
 */
@RestController
@RequestMapping("/student")
public class SchoolStudentController extends BaseController
{
    @Autowired
    private ISchoolStudentService schoolStudentService;

    /**
     * 查询学生列表
     */
    @RequiresPermissions("school:student:list")
    @GetMapping("/list")
    public TableDataInfo list(SchoolStudent schoolStudent)
    {
        startPage();
        List<SchoolStudent> list = schoolStudentService.selectSchoolStudentList(schoolStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生列表
     */
    @RequiresPermissions("school:student:export")
    @Log(title = "学生", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SchoolStudent schoolStudent)
    {
        List<SchoolStudent> list = schoolStudentService.selectSchoolStudentList(schoolStudent);
        ExcelUtil<SchoolStudent> util = new ExcelUtil<SchoolStudent>(SchoolStudent.class);
        util.exportExcel(response, list, "学生数据");
    }

    /**
     * 获取学生详细信息
     */
    @RequiresPermissions("school:student:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(schoolStudentService.selectSchoolStudentById(id));
    }

    /**
     * 新增学生
     */
    @RequiresPermissions("school:student:add")
    @Log(title = "学生", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SchoolStudent schoolStudent)
    {
        return toAjax(schoolStudentService.insertSchoolStudent(schoolStudent));
    }

    /**
     * 修改学生
     */
    @RequiresPermissions("school:student:edit")
    @Log(title = "学生", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SchoolStudent schoolStudent)
    {
        return toAjax(schoolStudentService.updateSchoolStudent(schoolStudent));
    }

    /**
     * 删除学生
     */
    @RequiresPermissions("school:student:remove")
    @Log(title = "学生", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(schoolStudentService.deleteSchoolStudentByIds(ids));
    }
}
