package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
