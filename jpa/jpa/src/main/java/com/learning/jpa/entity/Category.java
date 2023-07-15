package com.learning.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;


    @OneToMany(mappedBy = "category")
    private List<ItemCategory> itemCategoryList = new ArrayList<>();

}
