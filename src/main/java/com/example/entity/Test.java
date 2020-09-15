package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal age;

    private Date time;


}
