package com.nisith.restaurant.Booking;

import com.nisith.restaurant.Locations.Locations;
import com.nisith.restaurant.JWT.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    LocalDateTime create_at;

    @Column
    Integer branch;

    @Column
    Integer user_id;
    @Column
    Integer status;
    @Column
    LocalDate date;

    @Column
    Integer menu_id;

    @Column
    Integer menus_item;


    @ManyToOne
    @JoinColumn(name = "branch", insertable = false, updatable = false)
    Locations locations;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    User user;

}