/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Respuesta;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface RespuestaService {
    public Respuesta createRespuesta(Respuesta respuesta);

    public List<Respuesta> findAllRespuesta();

    public Respuesta saveRespuesta(Respuesta respuesta);

    public void deleteRespuesta(Respuesta respuesta);

    public Respuesta findRespuesta(Respuesta respuesta);
}
