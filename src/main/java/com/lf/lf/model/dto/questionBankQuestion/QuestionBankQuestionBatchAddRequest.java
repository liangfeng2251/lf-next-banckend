package com.lf.lf.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 批量创建题库题目关联请求
 *
 *  @author lf
 *
 */
@Data
public class QuestionBankQuestionBatchAddRequest implements Serializable {

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}
