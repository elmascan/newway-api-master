package com.newway.newwayapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.lang.reflect.Array;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Comment extends AbstractEntity {

    @Column(nullable = false)
    private List<Comment> comments;


}
