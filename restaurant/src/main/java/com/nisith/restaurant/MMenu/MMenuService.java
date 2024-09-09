package com.nisith.restaurant.MMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MMenuService {

    @Autowired
    private MMenuRepo mMenuRepo;

    public ResponseEntity<?> GetAll(int page, int pageSize, int order) {
        return ResponseEntity.ok(mMenuRepo.findAll(PageRequest.of(page, pageSize, Sort.by(order == 0 ? Sort.Direction.DESC : Sort.Direction.ASC, "id"))));
    }
    public ResponseEntity<?> Update(MMenu mMenu) {
        Optional<MMenu> restaurantMenuOptional = mMenuRepo.findById(mMenu.getId());
        return ResponseEntity.ok(mMenuRepo.save(mMenu));
    }
    public ResponseEntity<?> Add(MMenu mMenu) {
        Optional<MMenu> restaurantMenuOptional = mMenuRepo.findById(mMenu.getId());
            return ResponseEntity.ok(mMenuRepo.save(mMenu));
    }


}
