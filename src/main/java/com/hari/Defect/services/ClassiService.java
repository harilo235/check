package com.hari.Defect.services;

import com.hari.Defect.entities.Classi;
import org.springframework.stereotype.Service;


import java.awt.print.Book;
import java.util.List;


public interface ClassiService {

    void saveClassi(Classi classi);// save Classi
    List<Classi> getAllClassi();		//	Get All Classi
    Classi findClassiById(String id); // find classi by id - classiId
    Classi deleteClassiById(String id);	//	Delete Classi
    void updateClassi(Classi classi);		//	Update Classi
}
