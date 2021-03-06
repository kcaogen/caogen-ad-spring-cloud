package com.caogen.ad.index;

import lombok.Getter;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 17:42
 */
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(2, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
