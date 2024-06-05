package org.example.Conttoller;


import org.example.model.manage;
import org.example.repository.ManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class ManageControl{
        @Autowired
        ManageRepository manageRepository;
        @GetMapping
        public List<manage> getAllMessages(){
            return manageRepository.findAll();
        }
        @PostMapping
        public manage createMessage(@RequestBody manage man2){
            System.out.println(man2);
            manageRepository.save(man2);
            return man2;
        }
        @PutMapping("{id}")
        public Boolean upgrandeMessage(@PathVariable Integer id, @RequestBody manage mn){
            manage ms = manageRepository.findManageById(id);
            if (ms!= null) {
                mn.setId(id);
                manageRepository.saveAndFlush(mn);
                return true;
            }
            return false;
        }
        @DeleteMapping("{id}")
        public Boolean deleteMessage(@PathVariable Integer id){
            manageRepository.deleteById(id);
            return true;
        }
}

