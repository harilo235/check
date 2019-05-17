package com.hari.Defect.services;


import com.hari.Defect.entities.Classi;
import com.hari.Defect.repositories.ClassiRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.awt.print.Book;
import java.util.List;

@Service
public class ClassiServiceImpl implements ClassiService{

    @Autowired
    ClassiRepositories classiRepositories;


    @Override
    public void saveClassi(Classi classi) {
        classiRepositories.save(classi);

    }

    @Override
    public List<Classi> getAllClassi() {
        return classiRepositories.findAll();
    }

    @Override
    public Classi findClassiById(String id) {
        return classiRepositories.findClassiByclassiId(id);
    }

    @Override
    public Classi deleteClassiById(String id) {
        classiRepositories.deleteById(id);
        return null;
    }

    @Override
    public void updateClassi(Classi classi) {
        classiRepositories.save(classi);
    }
}
