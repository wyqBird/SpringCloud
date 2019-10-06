package com.wyq.web.bo;

import lombok.Data;

/**
 * 统一返回结果
 *
 * @author Yongqian Wang
 * @version 1.0
 */
@Data
public class ResponseData {
    private Boolean status = true;
    private int code = 200;
    private String message;
    private Object data;
}
