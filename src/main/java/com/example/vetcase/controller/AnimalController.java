package com.example.vetcase.controller;

import com.example.vetcase.model.Animal;
import com.example.vetcase.model.Owner;
import com.example.vetcase.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @RequestMapping(path = {"/animals","/animals/search"})
    public  String viewAnimalPage(Animal animal,Model model,String keyword){
        model.addAttribute("listAnimals",animalService.getAllAnimals(keyword));
        return "animals";
    }
    @GetMapping("/animals/edit/{id}")
    public String editAnimal(@PathVariable(name = "id") int id,Model model){
        Animal animal=this.animalService.getAnimalById(id);
        model.addAttribute("animal",animal);
        return "edit_animal";
    }
    @GetMapping("/animals/save")
    public  String saveAnimal(@ModelAttribute(name = "animal") Animal animal){
        this.animalService.saveAnimal(animal);
        return "redirect:/animals";
    }
    @GetMapping("/animals/delete/{id}")
    public String deleteAnimal(@PathVariable(name = "id" )int id){
        this.animalService.deleteAnimal(id);
        return "redirect:/animals";
    }

}
