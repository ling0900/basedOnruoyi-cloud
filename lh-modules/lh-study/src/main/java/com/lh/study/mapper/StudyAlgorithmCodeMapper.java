package com.lh.study.mapper;

import com.lh.study.domain.StudyAlgorithmCode;

import java.util.List;

/**
 * 算法学习Mapper接口
 * 
 * @author lh
 * @date 2022-04-24
 */
public interface StudyAlgorithmCodeMapper 
{
    /**
     * 查询算法学习
     * 
     * @param leetId 算法学习主键
     * @return 算法学习
     */
    public StudyAlgorithmCode selectStudyAlgorithmCodeByLeetId(Integer leetId);

    /**
     * 查询算法学习列表
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 算法学习集合
     */
    public List<StudyAlgorithmCode> selectStudyAlgorithmCodeList(StudyAlgorithmCode studyAlgorithmCode);

    /**
     * 新增算法学习
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 结果
     */
    public int insertStudyAlgorithmCode(StudyAlgorithmCode studyAlgorithmCode);

    /**
     * 修改算法学习
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 结果
     */
    public int updateStudyAlgorithmCode(StudyAlgorithmCode studyAlgorithmCode);

    /**
     * 删除算法学习
     * 
     * @param leetId 算法学习主键
     * @return 结果
     */
    public int deleteStudyAlgorithmCodeByLeetId(Integer leetId);

    /**
     * 批量删除算法学习
     * 
     * @param leetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudyAlgorithmCodeByLeetIds(Integer[] leetIds);
}
