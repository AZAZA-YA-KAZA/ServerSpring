package org.example.repository;

import org.example.model.manage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManageRepository  extends JpaRepository<manage, Integer> {
    public manage findManageById(Integer id);
}

