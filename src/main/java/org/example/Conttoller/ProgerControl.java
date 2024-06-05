package org.example.Conttoller;

import org.example.model.proger;
import org.example.repository.ProgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class ProgerControl {
    @Autowired
    ProgerRepository messageRepository;

    @GetMapping
    public List<proger> getAllMessages() {
        return messageRepository.findAll();
    }

    @PostMapping
    public proger createMessage(@RequestBody proger message2) {
        System.out.println(message2);
        messageRepository.save(message2);
        return message2;
    }

    @PutMapping("{id}")
    public Boolean upgrandeMessage(@PathVariable Integer id, @RequestBody proger message) {
        proger ms = messageRepository.findProgById(id);
        System.out.println(message.toString());
        if (ms != null) {
            message.setId(id);
            messageRepository.saveAndFlush(message);
            return true;
        }
        return false;
    }

    @DeleteMapping("{id}")
    public Boolean deleteMessage(@PathVariable Integer id) {
        messageRepository.deleteById(id);
        return true;
    }
}
