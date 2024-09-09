package com.nisith.restaurant.Booking;

import com.nisith.restaurant.Locations.LocationsRepo;
import com.nisith.restaurant.BranchTables.BranchTablesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepo repo;
    @Autowired
    private LocationsRepo locationsrepo;
    @Autowired
    private BranchTablesRepo tablesRepo;



    public ResponseEntity<?> Get(int page, int pageSize, int order, int status) {
        return ResponseEntity.ok(repo.findByComplete_status(status, PageRequest.of(page, pageSize, Sort.by(order == 0 ? Sort.Direction.DESC : Sort.Direction.ASC, "id"))));
    }
    public ResponseEntity<?> Get(int id) {
        Optional<Booking> reservationOptional = repo.findById(id);

        reservationOptional.get().setStatus(2);
        return ResponseEntity.ok(repo.save(reservationOptional.get()));
    }
    public ResponseEntity<?> Get(int page, int pageSize, int order) {
        return ResponseEntity.ok(repo.findAll(PageRequest.of(page, pageSize, Sort.by(order == 0 ? Sort.Direction.DESC : Sort.Direction.ASC, "id"))));
    }
    public ResponseEntity<?> Add(Booking booking) {

        booking.setDate(LocalDate.now());
        booking.setStatus(1);
        booking.setCreate_at(LocalDateTime.now());
        return ResponseEntity.ok(repo.save(booking));

    }


}
