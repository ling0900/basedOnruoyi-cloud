package com.lh.school.mapper;

import java.util.List;
import com.lh.school.domain.SchoolStudent;

/**
 * 学生Mapper接口
 * 
 * @author lh
 * @date 2022-04-24
 */
public interface SchoolStudentMapper 
{
    /**
     * 查询学生
     * 
     * @param id 学生主键
     * @return 学生
     */
    public SchoolStudent selectSchoolStudentById(Long id);

    /**
     * 查询学生列表
     * 
     * @param schoolStudent 学生
     * @return 学生集合
     */
    public List<SchoolStudent> selectSchoolStudentList(SchoolStudent schoolStudent);

    /**
     * 新增学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    public int insertSchoolStudent(SchoolStudent schoolStudent);

    /**
     * 修改学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    public int updateSchoolStudent(SchoolStudent schoolStudent);

    /**
     * 删除学生
     * 
     * @param id 学生主键
     * @return 结果
     */
    public int deleteSchoolStudentById(Long id);

    /**
     * 批量删除学生
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSchoolStudentByIds(Long[] ids);
}
