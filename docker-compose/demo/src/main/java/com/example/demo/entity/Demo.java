package com.example.demo.entity;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Demo implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private  long  count;
    @Column(nullable = false)
    private String path;
}
