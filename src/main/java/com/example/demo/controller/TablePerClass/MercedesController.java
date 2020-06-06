package com.example.demo.controller.TablePerClass;

import com.example.demo.model.TablePerClass.Mercedes;
import com.example.demo.repository.TablePerClass.MercedesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mercedes")
public class MercedesController {

    MercedesRepository mercedesRepository;

    MercedesController(MercedesRepository mercedesRepository) {
        this.mercedesRepository = mercedesRepository;
    }

    @GetMapping
    public List<Mercedes> getAll() {
        return mercedesRepository.findAll();
    }

    @PostMapping
    public Mercedes post(@RequestBody Mercedes mercedes) {
        return mercedesRepository.save(mercedes);
    }
}

