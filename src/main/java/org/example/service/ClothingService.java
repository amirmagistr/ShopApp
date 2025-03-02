package org.example.service;

import org.example.model.Clothing;
import java.util.List;

public interface ClothingService {
    void addClothing(Clothing clothing);
    Clothing getClothingById(int id);
    List<Clothing> getAllClothing();
}
