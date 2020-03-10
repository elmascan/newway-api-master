package com.newway.newwayapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Developer extends AbstractEntity {
    @Column(nullable = false)
    private String school_info;
    @Column(nullable = false)
    private String work_info;
    @Column(nullable = false)
    private String interests_info;

}
