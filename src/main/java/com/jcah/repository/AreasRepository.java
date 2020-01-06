package com.jcah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcah.models.Areas;

@Repository
public interface AreasRepository extends JpaRepository<Areas, Integer> {

}
