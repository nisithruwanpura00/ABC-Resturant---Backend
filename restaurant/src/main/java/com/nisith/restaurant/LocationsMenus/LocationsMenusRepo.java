package com.nisith.restaurant.LocationsMenus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsMenusRepo extends JpaRepository<LocationsMenus,Integer> {
}
