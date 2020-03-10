package com.newway.newwayapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends AbstractEntity {

    @Column(nullable = false)
    private String new_tag;

    public String getNew_tag() {
        return new_tag;
    }

    public void setNew_tag(String new_tag) {
        this.new_tag = new_tag;
    }
}
