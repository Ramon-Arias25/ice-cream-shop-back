package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.TerminalBox;

@Repository
public interface ITerminalBoxRepository extends JpaRepository<TerminalBox, Integer>{

}
