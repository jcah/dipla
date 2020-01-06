package com.jcah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcah.models.*;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
	
	

}
