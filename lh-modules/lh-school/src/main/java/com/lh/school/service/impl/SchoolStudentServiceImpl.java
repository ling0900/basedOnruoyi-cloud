package com.lh.school.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lh.school.mapper.SchoolStudentMapper;
import com.lh.school.domain.SchoolStudent;
import com.lh.school.service.ISchoolStudentService;

/**
 * 学生Service业务层处理
 * 
 * @author lh
 * @date 2022-04-24
 */
@Service
public class SchoolStudentServiceImpl implements ISchoolStudentService 
{
    @Autowired
    private SchoolStudentMapper schoolStudentMapper;

    /**
     * 查询学生
     * 
     * @param id 学生主键
     * @return 学生
     */
    @Override
    public SchoolStudent selectSchoolStudentById(Long id)
    {
        return schoolStudentMapper.selectSchoolStudentById(id);
    }

    /**
     * 查询学生列表
     * 
     * @param schoolStudent 学生
     * @return 学生
     */
    @Override
    public List<SchoolStudent> selectSchoolStudentList(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.selectSchoolStudentList(schoolStudent);
    }

    /**
     * 新增学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    @Override
    public int insertSchoolStudent(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.insertSchoolStudent(schoolStudent);
    }

    /**
     * 修改学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    @Override
    public int updateSchoolStudent(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.updateSchoolStudent(schoolStudent);
    }

    /**
     * 批量删除学生
     * 
     * @param ids 需要删除的学生主键
     * @return 结果
     */
    @Override
    public int deleteSchoolStudentByIds(Long[] ids)
    {
        return schoolStudentMapper.deleteSchoolStudentByIds(ids);
    }

    /**
     * 删除学生信息
     * 
     * @param id 学生主键
     * @return 结果
     */
    @Override
    public int deleteSchoolStudentById(Long id)
    {
        return schoolStudentMapper.deleteSchoolStudentById(id);
    }
}
