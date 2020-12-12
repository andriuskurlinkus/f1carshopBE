package com.project.F1carstoreBE.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Setter
@Getter
@ToString
@Table
public class Product extends BaseEntity{
    @Column
    private String name;
    @Column(length = 500)
    private String description;
    @Column
    @Positive
    private int count;
    @Column
    @Positive
    private double price;

    public Product(String name, String description, int count, double price) {
        this.name = name;
        this.description = description;
        this.count = count;
        this.price = price;
    }
}
