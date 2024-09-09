package com.nisith.restaurant.Locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/branch")
public class LocationsController {

    @Autowired
    LocationsService service;

    @GetMapping(path = "/{page}/{page_size}")
    ResponseEntity<?> GetAll(@PathVariable int page, @PathVariable int page_size) {
        return service.GetAll(page, page_size);
    }
    @PutMapping(path = "")
    ResponseEntity<?> Update(@RequestBody Locations locations) {
        return service.Update(locations);
    }




    @PostMapping(path = "")
    ResponseEntity<?> Add(@RequestBody Locations locations) {
        return service.Add(locations);
    }    @PostMapping(path = "status")
    ResponseEntity<?> StatusChange(@RequestParam int branch_id, boolean status) {
        return service.StatusChange(branch_id, status);
    }

}
