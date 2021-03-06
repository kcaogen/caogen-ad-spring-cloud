package com.caogen.ad.vo;

import com.caogen.ad.constant.CommonStatus;
import com.caogen.ad.entity.Creative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 18:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeRequest {

    private String name;

    private Integer type;

    private Integer materialType;

    private Integer height;

    private Integer width;

    private Long size;

    private Integer duration;

    private Long userId;

    private String url;

    public Creative convertToEntity() {

        Creative creative = new Creative();
        creative.setName(name);
        creative.setType(type);
        creative.setMaterialType(materialType);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setSize(size);
        creative.setDuration(duration);
        creative.setAuditStatus(CommonStatus.VALID.getStatus());
        creative.setUserId(userId);
        creative.setUrl(url);
        creative.setCreateTime(new Date());
        creative.setUpdateTime(creative.getCreateTime());

        return creative;
    }

}
