package com.newway.newwayapi.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Roadmap extends AbstractEntity {

    @Column(nullable = false)
    private String head_name;
    @Column(nullable = false)
    private String including_name;


}
