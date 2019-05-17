package com.hari.Defect.repositories;

import com.hari.Defect.entities.Classi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;


public interface ClassiRepositories extends JpaRepository<Classi, String> {
    Classi findClassiByclassiId(String id);

}
