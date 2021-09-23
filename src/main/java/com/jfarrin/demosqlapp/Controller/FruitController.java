package com.jfarrin.demosqlapp.Controller;

import com.jfarrin.demosqlapp.Model.Fruit;
import com.jfarrin.demosqlapp.Repository.FruitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {

    private FruitRepository repository;

    public FruitController(FruitRepository repository){
        this.repository = repository;
    }

    @GetMapping("/fruits")
    public Iterable<Fruit> getAllFruitFromDB() {
        return this.repository.findAll();
    }

    @PostMapping("/fruits")
    public void addFruitToDatabase(@RequestBody Fruit fruit) {
        this.repository.save(fruit);
    }

//    @PostMapping()
//    public void addMultipleFruitToDatabase(@RequestBody List<Fruit> fruit) {
//        this.repository.saveAll(fruit);
//    }
}
