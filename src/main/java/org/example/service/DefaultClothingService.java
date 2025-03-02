package org.example.service;

import org.example.model.Clothing;
import org.example.repository.ClothingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class DefaultClothingService implements ClothingService {
    private final ClothingRepository repository;

    @Autowired
    public DefaultClothingService(ClothingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addClothing(Clothing clothing) {
        repository.save(clothing);
        System.out.println("Added clothing: " + clothing.getName());
    }

    @Override
    public Clothing getClothingById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Clothing> getAllClothing() {
        return repository.findAll();
    }
}
