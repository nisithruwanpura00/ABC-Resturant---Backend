package com.nisith.restaurant.Locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationsService {

    @Autowired
    LocationsRepo repo;


    public ResponseEntity<?> GetAll(int page, int pageSize) {
        return ResponseEntity.ok(repo.findAll(PageRequest.of(page,pageSize)));
    }
    public ResponseEntity<?> Add(Locations locations) {
        locations.setId(null);
        return ResponseEntity.ok(repo.save(locations));

    }
    public ResponseEntity<?> StatusChange(int branchId, boolean status) {
        Optional<Locations> branchOptional = repo.findById(branchId);

        branchOptional.get().setEnable(status);
        return ResponseEntity.ok(repo.save(branchOptional.get()));
    }


    public ResponseEntity<?> Update(Locations locations) {
        Optional<Locations> branchOptional = repo.findById(locations.getId());
        return ResponseEntity.ok(repo.save(locations));
    }

}
