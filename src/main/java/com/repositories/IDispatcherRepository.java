package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Dispatch;
@Repository
public interface IDispatcherRepository extends JpaRepository<Dispatch, Integer>{

}
