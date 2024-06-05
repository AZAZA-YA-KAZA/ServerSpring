package org.example.Conttoller;

import org.example.model.task;
import org.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messag")
public class TaskControl {
    @Autowired
    TaskRepository taskRepository;

    @GetMapping
    public List<task> getAllMessages() {
        return taskRepository.findAll();
    }

    @PostMapping
    public task createMessage(@RequestBody task message2) {
        System.out.println(message2);
        taskRepository.save(message2);
        return message2;
    }

    @PutMapping("{id}")
    public Boolean upgrandeMessage(@PathVariable Integer id, @RequestBody task message) {
        task ms = taskRepository.findTaskById(id);
        if (ms != null) {
            message.setId(id);
            taskRepository.saveAndFlush(message);
            return true;
        }
        return false;
    }

    @DeleteMapping("{id}")
    public Boolean deleteMessage(@PathVariable Integer id) {
        taskRepository.deleteById(id);
        return true;
    }
}
