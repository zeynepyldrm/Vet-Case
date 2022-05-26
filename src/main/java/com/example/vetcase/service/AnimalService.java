package com.example.vetcase.service;

import com.example.vetcase.model.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals(String keyword);
    void saveAnimal(Animal animal);
    Animal getAnimalById(int id);
    void deleteAnimal(int id);



}
