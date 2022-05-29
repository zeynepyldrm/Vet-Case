package com.example.vetcase.service;

import com.example.vetcase.model.Animal;
import com.example.vetcase.model.Owner;
import com.example.vetcase.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public List<Owner> getAllOwners() {
         return ownerRepository.findAll();
    }

    @Override
    public void saveOwners(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public Owner ownerGetById(int id) {
       Optional<Owner> o=ownerRepository.findById(id);
       Owner owner=null;
       if(o.isPresent()){
           owner=o.get();
       }else {
            throw new  RuntimeException("owner not found.");
       }
       return  owner;
    }
}
