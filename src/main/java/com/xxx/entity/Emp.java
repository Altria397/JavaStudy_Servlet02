package com.xxx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: JavaStudy_Servlet02
 * @description: 用户实体层
 * @author: Altria397
 * @create: 2023-09-13 16:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer empno;
    private String ename;
}
