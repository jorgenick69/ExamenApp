/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Examen;
import ExamenApp.ExamenApp.repository.ExamenRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class ExamenServiceIMPL implements ExamenService {

    @Autowired
    private ExamenRepository er;

    @Override

    public Examen createExamen(Examen examen) {
        Examen nuevo = er.save(examen);
        return nuevo;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Examen> findAllExamen() {
        return (List<Examen>) er.findAll();
    }

    @Transactional
    @Override
    public Examen saveExamen(Examen examen) {
        Examen nuevo = er.save(examen);
        return nuevo;

    }

    @Transactional
    @Override
    public void deleteExamen(Examen examen) {
        er.delete(examen);
    }

    @Transactional(readOnly = true)
    @Override
    public Examen findExamen(Examen examen) {
        return er.findById(examen.getId()).orElse(null);

    }

    @Transactional(readOnly = true)
    @Override
    public Examen findExamenById(Long id) {
        return er.findById(id).orElse(null);
    }

}
