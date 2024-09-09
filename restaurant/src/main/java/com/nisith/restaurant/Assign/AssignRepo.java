package com.nisith.restaurant.Assign;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignRepo extends JpaRepository<Assign, Integer> {

}
