package com.nisith.restaurant.LocationsMenus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LocationsMenusService {
    @Autowired
    private LocationsMenusRepo repo;

    public ResponseEntity<?> GetAll(int page, int pageSize, int order) {
        return ResponseEntity.ok(repo.findAll(PageRequest.of(page, pageSize, Sort.by(order == 0 ? Sort.Direction.DESC : Sort.Direction.ASC, "id"))));
    }
    public ResponseEntity<?> Update(LocationsMenus locationsMenus) {

            return ResponseEntity.ok(repo.save(locationsMenus));
    }
    public ResponseEntity<?> Add(LocationsMenus restaurantMenu) {


        return ResponseEntity.ok(repo.save(restaurantMenu));
    }
}
