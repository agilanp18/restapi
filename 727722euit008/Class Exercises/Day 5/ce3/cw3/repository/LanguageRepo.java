package com.example.d5pb3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d5pb3.model.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language,Integer> {
    
}
