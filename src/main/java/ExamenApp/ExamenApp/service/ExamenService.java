/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Examen;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface ExamenService {
    public Examen createExamen(Examen examen);

    public List<Examen> findAllExamen();

    public Examen saveExamen(Examen examen);

    public void deleteExamen(Examen examen);

    public Examen findExamen(Examen examen);
}
