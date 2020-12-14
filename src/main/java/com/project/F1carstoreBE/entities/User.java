package com.project.F1carstoreBE.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Setter
@Getter
@ToString
@Table
public class User extends BaseEntity{

    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String type;

    public User(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }
}
