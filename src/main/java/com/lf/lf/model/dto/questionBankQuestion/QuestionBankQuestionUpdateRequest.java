package com.lf.lf.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新题库题目关联请求
 *
 *  @author lf
 *   
 */
@Data
public class QuestionBankQuestionUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}