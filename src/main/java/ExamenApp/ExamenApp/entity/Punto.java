/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.entity;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Jorge Dominguez
 */
@Data
@Entity
@Table(name = "punto")
public class Punto implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enunciado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "punto_id")
    private List<Solucion>soluciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "punto_id")
    private List<Respuesta>respuesta;
    private Double valor;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "examen_id", nullable = false)
    private Examen examen_id;
    
}
