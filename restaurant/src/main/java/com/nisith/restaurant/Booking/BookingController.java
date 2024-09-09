package com.nisith.restaurant.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/booking")
public class BookingController {
    @Autowired
    BookingService service;




    @GetMapping(path = "/{id}")
    ResponseEntity<?>Get(@PathVariable int id){
        return service.Get(id);
    }
    @GetMapping(path = "/{page}/{page_size}/{order}")
    ResponseEntity<?>Get(@PathVariable int page ,@PathVariable int page_size,@PathVariable int order){
        return service.Get(page,page_size,order);
    }
    @GetMapping(path = "/{page}/{page_size}/{order}/{status}")
    ResponseEntity<?> Get(@PathVariable int page, @PathVariable int page_size, @PathVariable int order, @PathVariable int status) {
        return service.Get(page, page_size, order,status);
    }
    @PostMapping(path = "")
    ResponseEntity<?> Add(@RequestBody Booking booking) {
        return service.Add(booking);
    }



}
