package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Taste;

@Repository
public interface ITasteRepository extends JpaRepository<Taste, Integer>{

}
