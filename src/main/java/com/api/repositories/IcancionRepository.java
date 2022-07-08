package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.CancionEntity;

public interface IcancionRepository extends JpaRepository<CancionEntity, Long> {

}
