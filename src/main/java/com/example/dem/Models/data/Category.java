package com.example.dem.Models.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "categories")
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @SizeRequirements(min=2, message=" Name must at least 2 characteres long")
    private String name;
    private String slug;
    private int sorting;


    public Category() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getSorting() {
        return this.sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }





    public Category(int id, String name, String slug, int sorting) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.sorting = sorting;
    }



}
