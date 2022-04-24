package com.lh.study.service.impl;

import com.lh.study.domain.StudyAlgorithmCode;
import com.lh.study.mapper.StudyAlgorithmCodeMapper;
import com.lh.study.service.IStudyAlgorithmCodeService;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 算法学习Service业务层处理
 * 
 * @author lh
 * @date 2022-04-24
 */
@Service
public class StudyAlgorithmCodeServiceImpl implements IStudyAlgorithmCodeService 
{
    @Autowired
    private StudyAlgorithmCodeMapper studyAlgorithmCodeMapper;

    /**
     * 查询算法学习
     * 
     * @param leetId 算法学习主键
     * @return 算法学习
     */
    @Override
    public StudyAlgorithmCode selectStudyAlgorithmCodeByLeetId(Integer leetId)
    {
        return studyAlgorithmCodeMapper.selectStudyAlgorithmCodeByLeetId(leetId);
    }

    /**
     * 查询算法学习列表
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 算法学习
     */
    @Override
    public List<StudyAlgorithmCode> selectStudyAlgorithmCodeList(StudyAlgorithmCode studyAlgorithmCode)
    {
        return studyAlgorithmCodeMapper.selectStudyAlgorithmCodeList(studyAlgorithmCode);
    }

    /**
     * 新增算法学习
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 结果
     */
    @Override
    public int insertStudyAlgorithmCode(StudyAlgorithmCode studyAlgorithmCode)
    {
        studyAlgorithmCode.setCreateTime(DateUtils.getNowDate());
        return studyAlgorithmCodeMapper.insertStudyAlgorithmCode(studyAlgorithmCode);
    }

    /**
     * 修改算法学习
     * 
     * @param studyAlgorithmCode 算法学习
     * @return 结果
     */
    @Override
    public int updateStudyAlgorithmCode(StudyAlgorithmCode studyAlgorithmCode)
    {
        studyAlgorithmCode.setUpdateTime(DateUtils.getNowDate());
        return studyAlgorithmCodeMapper.updateStudyAlgorithmCode(studyAlgorithmCode);
    }

    /**
     * 批量删除算法学习
     * 
     * @param leetIds 需要删除的算法学习主键
     * @return 结果
     */
    @Override
    public int deleteStudyAlgorithmCodeByLeetIds(Integer[] leetIds)
    {
        return studyAlgorithmCodeMapper.deleteStudyAlgorithmCodeByLeetIds(leetIds);
    }

    /**
     * 删除算法学习信息
     * 
     * @param leetId 算法学习主键
     * @return 结果
     */
    @Override
    public int deleteStudyAlgorithmCodeByLeetId(Integer leetId)
    {
        return studyAlgorithmCodeMapper.deleteStudyAlgorithmCodeByLeetId(leetId);
    }
}
