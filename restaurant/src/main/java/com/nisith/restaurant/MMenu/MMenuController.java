package com.nisith.restaurant.MMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/mmenu")
public class MMenuController {
    @Autowired
    MMenuService mMenuService;

    @GetMapping(path = "/{page}/{page_size}/{order}")
    ResponseEntity<?> GetAll(@PathVariable int page, @PathVariable int page_size, @PathVariable int order) {
        return mMenuService.GetAll(page, page_size, order);
    }
    @PutMapping(path = "")
    ResponseEntity<?> Update(@RequestBody MMenu mMenu) {
        return mMenuService.Update(mMenu);
    }

    @PostMapping(path = "")
    ResponseEntity<?> Add(@RequestBody MMenu mMenu) {
        return mMenuService.Add(mMenu);
    }


}
