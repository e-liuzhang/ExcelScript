package com.fpi.script.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author shangang_luo
 * @Date 2020/10/13 16:05
 * Description: 读取Excel时，封装读取的每一行的数据
 */


@Setter
@Getter
@ToString
public class ExcelDataVO {
    private String code;
    private String name;

}
