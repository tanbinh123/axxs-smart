package com.smart.db.model;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class MplUserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * id
     *
     * @mbggenerated
     */
    private Integer id;
    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;
    /**
     * 角色编号
     *
     * @mbggenerated
     */
    private Integer roleId;
}