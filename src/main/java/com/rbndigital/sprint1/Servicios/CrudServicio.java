package com.rbndigital.sprint1.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rbndigital.sprint1.Entidades.Votantes;

@Repository
public interface CrudServicio extends JpaRepository<Votantes, Integer> {

}









