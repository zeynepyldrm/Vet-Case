package com.example.vetcase.service;

import com.example.vetcase.model.Animal;
import com.example.vetcase.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImp implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public List<Animal> getAllAnimals(String keyword) {
        if(keyword!=null){
            return  animalRepository.findByKeyword(keyword);
        }
        return animalRepository.findAll();
    }

    @Override
    public void saveAnimal(Animal animal) {
        this.animalRepository.save(animal);
    }

    @Override
    public Animal getAnimalById(int id) {
        Optional<Animal> optional =this.animalRepository.findById(id);
        Animal animal=null;
        if(optional.isPresent()){
            animal=optional.get();
        }else{
            throw  new RuntimeException("Animal not found.");
        }
        return  animal;
    }
    @Override
    public void deleteAnimal(int id) {
        this.animalRepository.deleteById(id);
    }
}
