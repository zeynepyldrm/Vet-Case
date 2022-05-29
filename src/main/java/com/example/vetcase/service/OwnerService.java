package com.example.vetcase.service;

import com.example.vetcase.model.Animal;
import com.example.vetcase.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OwnerService {
    List<Owner> getAllOwners();
    void saveOwners(Owner owner);
    Owner ownerGetById(int id);


}
