package org.example.Conttoller;

import org.example.model.whoi;
import org.example.repository.ManageRepository;
import org.example.repository.ProgerRepository;
import org.example.repository.WhoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messa")
public class WhoIControl {
    @Autowired
    private ManageRepository manageRepository;
    @Autowired
    private ProgerRepository progerRepository;

    @Autowired
    WhoiRepository whoiRepository;

    @GetMapping
    public List<whoi> getAllMessages() {
        return whoiRepository.findAll();
    }

    @PostMapping
    public whoi createMessage(@RequestBody whoi man2) {
        System.out.println(man2);
        whoiRepository.save(man2);
        return man2;
    }

    @PutMapping("{id}")
    public Boolean upgrandeMessage(@PathVariable Integer id, @RequestBody whoi mn) {
        whoi ms = whoiRepository.findWhoById(id);
        if (ms != null) {
            mn.setId(id);
            whoiRepository.saveAndFlush(mn);
            return true;
        }
        return false;
    }

    @DeleteMapping("{id}")
    public Boolean deleteMessage(@PathVariable Integer id) {
        whoiRepository.deleteById(id);
        return true;
    }
}
