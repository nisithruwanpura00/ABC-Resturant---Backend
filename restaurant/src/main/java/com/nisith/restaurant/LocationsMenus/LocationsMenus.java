package com.nisith.restaurant.LocationsMenus;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LocationsMenus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String name;




}
