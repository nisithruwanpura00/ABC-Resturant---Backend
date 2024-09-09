package com.nisith.restaurant.MMenu;

import com.nisith.restaurant.Assign.Assign;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class MMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @OneToMany(mappedBy = "menu_main_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assign> assignList;
    @Column
    private String name;

}
