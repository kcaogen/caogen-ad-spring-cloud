package com.caogen.ad.dto;

import com.caogen.ad.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-03 17:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableTemplate {

    private String tableName;

    private String level;

    private Map<OpType, List<String>> opTypeFieldSetMap = new HashMap<>();

    /**
     * 字段索引 -> 字段名
     */
    private Map<Integer, String> posMap = new HashMap<>();

}
