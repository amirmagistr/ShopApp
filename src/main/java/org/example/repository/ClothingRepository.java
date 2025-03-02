package org.example.repository;

import org.example.model.Clothing;

import java.util.List;

public interface ClothingRepository {
    void save(Clothing clothing);
    Clothing findById(int id);
    List<Clothing> findAll();
}
