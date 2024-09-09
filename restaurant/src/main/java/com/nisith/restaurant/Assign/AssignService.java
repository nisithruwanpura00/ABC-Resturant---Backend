package com.nisith.restaurant.Assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AssignService {
    @Autowired
    AssignRepo assignRepo;

    public ResponseEntity<?> Add(Assign assign) {
        return ResponseEntity.ok(assignRepo.save(assign));
    }
}
