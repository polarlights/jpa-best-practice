package com.polarlights.bestpractice.jpa.jpa.time.domain;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.polarlights.bestpractice.jpa.jpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "time_post")
public class Post extends BaseEntity {

    private static final long serialVersionUID = -1L;
    private LocalDateTime localDateTime;
}
