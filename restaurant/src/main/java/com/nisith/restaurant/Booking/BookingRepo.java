package com.nisith.restaurant.Booking;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

    @Query("select r from Booking r where r.status = ?1")
    List<Booking> findByComplete_status(Integer complete_status, PageRequest pageRequest);

}
