package com.lf.lf.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 批量删除题目
 *
 *  @author lf
 *
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}

