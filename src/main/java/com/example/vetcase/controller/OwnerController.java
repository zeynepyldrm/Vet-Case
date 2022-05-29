package com.example.vetcase.controller;

import com.example.vetcase.model.Owner;
import com.example.vetcase.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @GetMapping("/owners")
    public String ownerPage(Model model){
        model.addAttribute("listOwners",ownerService.getAllOwners());
        return "owners";
    }
    @GetMapping("/owners/edit/{id}")
    public String editOwner(@PathVariable(name = "id") int id,Model model){
        Owner owner=ownerService.ownerGetById(id);
        model.addAttribute("owner",owner);
        return "edit_owner";
    }
    @GetMapping("/owners/save")
    public String saveOwner(@ModelAttribute(name = "owner") Owner owner){
        this.ownerService.saveOwners(owner);
        return  "redirect:/owners";
    }
    @GetMapping("/showNewOwnerForm")
    public String newOwner(Model model){
        Owner owner=new Owner();
        model.addAttribute("owner",owner);
        return "newOwner";
    }


}
