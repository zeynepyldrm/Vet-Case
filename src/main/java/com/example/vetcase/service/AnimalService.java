package com.example.vetcase.service;

import com.example.vetcase.model.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals();
    void saveAnimal(Animal animal);
    Animal getAnimalById(int id);

}
