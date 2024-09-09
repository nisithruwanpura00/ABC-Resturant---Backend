package com.nisith.restaurant.LocationsMenus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/locations-menu")
public class LocationsMenusController {
    @Autowired
    LocationsMenusService service;
    @GetMapping(path = "/{page}/{page_size}/{order}")
    ResponseEntity<?> GetAll(@PathVariable int page, @PathVariable int page_size, @PathVariable int order) {
        return service.GetAll(page, page_size, order);
    }
    @PostMapping(path = "")
    ResponseEntity<?> Add(@RequestBody LocationsMenus locationsMenus) {
        return service.Add(locationsMenus);
    }
    @PutMapping(path = "")
    ResponseEntity<?> Update(@RequestBody LocationsMenus locationsMenus) {
        return service.Update(locationsMenus);
    }

}
