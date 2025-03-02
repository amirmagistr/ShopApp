package org.example.repository;

import org.example.model.Clothing;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClothingRepositoryImpl implements ClothingRepository {
    private final List<Clothing> storage = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void save(Clothing clothing) {
        if (clothing.getId() == 0) {
            clothing.setId(idCounter++);
        }
        storage.add(clothing);
    }

    @Override
    public Clothing findById(int id) {
        for (Clothing clothing : storage) {
            if (clothing.getId() == id) {
                return clothing;
            }
        }
        return null;
    }

    @Override
    public List<Clothing> findAll() {
        return new ArrayList<>(storage);
    }
}
