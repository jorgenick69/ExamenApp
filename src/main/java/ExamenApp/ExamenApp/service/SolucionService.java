/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Solucion;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface SolucionService {

    public Solucion createSolucion(Solucion solucion);

    public List<Solucion> findAllSolucion();

    public Solucion saveSolucion(Solucion solucion);

    public void deleteSolucion(Solucion solucion);

    public Solucion findSolucion(Solucion solucion);
}
