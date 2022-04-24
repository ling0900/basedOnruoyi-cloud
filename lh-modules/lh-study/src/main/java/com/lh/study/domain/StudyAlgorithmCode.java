package com.lh.study.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 算法学习对象 study_algorithm_code
 * 
 * @author lh
 * @date 2022-04-24
 */
public class StudyAlgorithmCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 排序 */
    private Integer leetId;

    /** 题目 */
    @Excel(name = "题目")
    private String leetName;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** leetcode链接 */
    @Excel(name = "leetcode链接")
    private String leetCodeUrl;

    /** 题目类型 */
    @Excel(name = "题目类型")
    private String leetType;

    /** 是否被删除（0 no1 yes） */
    @Excel(name = "是否被删除", readConverterExp = "0=,n=o1,y=es")
    private String status;

    public void setLeetId(Integer leetId) 
    {
        this.leetId = leetId;
    }

    public Integer getLeetId() 
    {
        return leetId;
    }
    public void setLeetName(String leetName) 
    {
        this.leetName = leetName;
    }

    public String getLeetName() 
    {
        return leetName;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setLeetCodeUrl(String leetCodeUrl) 
    {
        this.leetCodeUrl = leetCodeUrl;
    }

    public String getLeetCodeUrl() 
    {
        return leetCodeUrl;
    }
    public void setLeetType(String leetType) 
    {
        this.leetType = leetType;
    }

    public String getLeetType() 
    {
        return leetType;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("leetId", getLeetId())
            .append("leetName", getLeetName())
            .append("description", getDescription())
            .append("leetCodeUrl", getLeetCodeUrl())
            .append("leetType", getLeetType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .append("status", getStatus())
            .toString();
    }
}
