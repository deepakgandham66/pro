package com.example.pro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pro.model.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Long> {

}
