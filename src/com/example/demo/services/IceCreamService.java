package com.example.demo.services;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.IceCream;
import com.example.demo.model.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IceCreamService implements CrudRepository {

    Set<Product> iceCreams = new HashSet<>();

    @Override
    public boolean add(Product object) {
        iceCreams.add(object);
        return true;
    }

    @Override
    public List<Product> findAll() {
        List<Product> iceCreamList = new ArrayList<>(iceCreams);
        return iceCreamList;
    }
}
