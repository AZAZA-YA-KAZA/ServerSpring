package org.example.repository;

import org.example.model.task;
import org.hibernate.secure.internal.JaccSecurityListener;
import org.hibernate.secure.spi.JaccService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<task, Integer> {
    public task findTaskById(Integer id);
}
