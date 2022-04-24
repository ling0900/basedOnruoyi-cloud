package com.lh.study.controller;

import com.lh.study.domain.StudyAlgorithmCode;
import com.lh.study.service.IStudyAlgorithmCodeService;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 算法学习Controller
 * 
 * @author lh
 * @date 2022-04-24
 */
@RestController
@RequestMapping("/algorithm")
public class StudyAlgorithmCodeController extends BaseController
{
    @Autowired
    private IStudyAlgorithmCodeService studyAlgorithmCodeService;

    /**
     * 查询算法学习列表
     */
    @RequiresPermissions("study:algorithm:list")
    @GetMapping("/list")
    public TableDataInfo list(StudyAlgorithmCode studyAlgorithmCode)
    {
        startPage();
        List<StudyAlgorithmCode> list = studyAlgorithmCodeService.selectStudyAlgorithmCodeList(studyAlgorithmCode);
        return getDataTable(list);
    }

    /**
     * 导出算法学习列表
     */
    @RequiresPermissions("study:algorithm:export")
    @Log(title = "算法学习", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StudyAlgorithmCode studyAlgorithmCode)
    {
        List<StudyAlgorithmCode> list = studyAlgorithmCodeService.selectStudyAlgorithmCodeList(studyAlgorithmCode);
        ExcelUtil<StudyAlgorithmCode> util = new ExcelUtil<StudyAlgorithmCode>(StudyAlgorithmCode.class);
        util.exportExcel(response, list, "算法学习数据");
    }

    /**
     * 获取算法学习详细信息
     */
    @RequiresPermissions("study:algorithm:query")
    @GetMapping(value = "/{leetId}")
    public AjaxResult getInfo(@PathVariable("leetId") Integer leetId)
    {
        return AjaxResult.success(studyAlgorithmCodeService.selectStudyAlgorithmCodeByLeetId(leetId));
    }

    /**
     * 新增算法学习
     */
    @RequiresPermissions("study:algorithm:add")
    @Log(title = "算法学习", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StudyAlgorithmCode studyAlgorithmCode)
    {
        return toAjax(studyAlgorithmCodeService.insertStudyAlgorithmCode(studyAlgorithmCode));
    }

    /**
     * 修改算法学习
     */
    @RequiresPermissions("study:algorithm:edit")
    @Log(title = "算法学习", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StudyAlgorithmCode studyAlgorithmCode)
    {
        return toAjax(studyAlgorithmCodeService.updateStudyAlgorithmCode(studyAlgorithmCode));
    }

    /**
     * 删除算法学习
     */
    @RequiresPermissions("study:algorithm:remove")
    @Log(title = "算法学习", businessType = BusinessType.DELETE)
	@DeleteMapping("/{leetIds}")
    public AjaxResult remove(@PathVariable Integer[] leetIds)
    {
        return toAjax(studyAlgorithmCodeService.deleteStudyAlgorithmCodeByLeetIds(leetIds));
    }
}
