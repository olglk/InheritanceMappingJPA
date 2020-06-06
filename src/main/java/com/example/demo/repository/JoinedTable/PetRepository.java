package com.example.demo.repository.JoinedTable;

import com.example.demo.model.JoinedTable.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
