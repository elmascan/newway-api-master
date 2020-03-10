package com.newway.newwayapi.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Vote extends AbstractEntity {

    @Column(nullable = false)
    private String user_Votes;
    @Column(nullable = false)
    private String user_Answers;

}
