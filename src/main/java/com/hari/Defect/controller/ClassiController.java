package com.hari.Defect.controller;


import com.hari.Defect.entities.Classi;
import com.hari.Defect.services.ClassiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.awt.print.Book;
import java.util.List;

@RestController
public class ClassiController {
    @Autowired
    ClassiService classiService;


    //Save Classi
    @PostMapping("/saveClassi")
    public HttpStatus createClassi(@Valid @RequestBody Classi classi) {
        classiService.saveClassi(classi);
        return HttpStatus.CREATED;
    }

    //Get All Classi
    @GetMapping("/findAll")
    public List<Classi> findAll() {
        return classiService.getAllClassi();
    }

    //Delete Classi
    @DeleteMapping("/deleteClassi/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") String id) {
        classiService.deleteClassiById(id);
        return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
    }

    //Update Classi
    @PutMapping("/updateClassi")
    public ResponseEntity<Classi> updateBook(@Valid @RequestBody Classi classi) {
        classiService.updateClassi(classi);
        return new ResponseEntity<Classi>(classi, HttpStatus.OK);
    }

}
