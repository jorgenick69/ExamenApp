/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Punto;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface PuntoService {
    public Punto createPunto(Punto punto);

    public List<Punto> findAllPunto();

    public Punto savePunto(Punto punto);

    public void deletePunto(Punto punto);

    public Punto findPunto(Punto punto);   
}
