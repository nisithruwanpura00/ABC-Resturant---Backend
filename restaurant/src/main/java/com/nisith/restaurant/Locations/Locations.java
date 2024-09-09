package com.nisith.restaurant.Locations;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(columnDefinition = "TINYINT")
    private Boolean enable;
    @Column
    private String branch_name;





}
