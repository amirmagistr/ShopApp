package org.example.service;

import org.example.model.Clothing;
import org.example.repository.ClothingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Qualifier("premiumService")
public class PremiumClothingService implements ClothingService {
    private final ClothingRepository repository;

    @Autowired
    public PremiumClothingService(ClothingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addClothing(Clothing clothing) {
        repository.save(clothing);
        System.out.println("Premium service added: " + clothing.getName() + " (VIP treatment)");
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
