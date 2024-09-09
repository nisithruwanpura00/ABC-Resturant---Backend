package com.nisith.restaurant.BranchTables;

import com.nisith.restaurant.Locations.Locations;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BranchTables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    int tablesCount;

    @Column(unique = true)
    private Integer branchId;

    @ManyToOne
    @JoinColumn(name = "branchId", insertable = false, updatable = false)
    Locations locations;

}
