package com.nisith.restaurant.BranchTables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchTablesService {
    @Autowired
    BranchTablesRepo tablesRepo;





    public ResponseEntity<?> Get(int page, int pageSize) {
        return ResponseEntity.ok(tablesRepo.findAll(PageRequest.of(page, pageSize)));
    }
    public ResponseEntity<?> Update(BranchTables branchTables) {
        return ResponseEntity.ok(tablesRepo.save(branchTables));
    }
    public ResponseEntity<?> Add(BranchTables branchTables) {
        Optional<BranchTables> branchTablesOptional = tablesRepo.findByBranchId(branchTables.getBranchId());
        if (branchTablesOptional.isPresent()) {
            branchTables.setId(branchTablesOptional.get().getId());
        }
        return ResponseEntity.ok(tablesRepo.save(branchTables));
    }

}
