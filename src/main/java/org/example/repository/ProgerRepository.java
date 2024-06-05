package org.example.repository;

import org.example.model.proger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgerRepository extends JpaRepository<proger, Integer> {
    public proger findProgById(Integer id);
}
