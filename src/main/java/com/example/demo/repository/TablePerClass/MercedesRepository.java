package com.example.demo.repository.TablePerClass;

import com.example.demo.model.TablePerClass.Mercedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MercedesRepository extends JpaRepository<Mercedes, Integer> {
}
