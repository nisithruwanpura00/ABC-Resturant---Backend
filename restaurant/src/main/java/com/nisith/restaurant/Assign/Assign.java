package com.nisith.restaurant.Assign;

import com.nisith.restaurant.LocationsMenus.LocationsMenus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Assign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column
    private Integer menu_main_id;

    @Column
    private Integer menu_id;

    @Column(columnDefinition = "TINYINT")
    private Boolean enable;

    @ManyToOne
    @JoinColumn(name = "menuTypeId", insertable = false, updatable = false)
    private LocationsMenus locationsMenus;
}
