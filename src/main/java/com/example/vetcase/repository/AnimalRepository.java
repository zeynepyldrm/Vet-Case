package com.example.vetcase.repository;

import com.example.vetcase.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {
    // search keyword query
    @Query(value = "select * from animals a join owners o on a.owner_id=o.owner_id   " +
            "where a.name like %:keyword% or o.first_name like %:keyword% or o.last_name like %:keyword%", nativeQuery = true)
    List<Animal> findByKeyword(@Param("keyword") String keyword);

}
