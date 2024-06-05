package org.example.repository;
import org.example.model.whoi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhoiRepository  extends JpaRepository<whoi, Integer> {
    public whoi findWhoById(Integer id);
}
