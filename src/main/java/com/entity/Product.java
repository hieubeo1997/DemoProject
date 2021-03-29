package com.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblProduct")

public class Product {
    @Id
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "price")
    private float price;


}
