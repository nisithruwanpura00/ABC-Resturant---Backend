package com.nisith.restaurant.MMenu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MMenuRepo extends JpaRepository<MMenu, Integer> {
}
