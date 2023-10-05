package ar.edu.unju.fi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{

	@Id
    private long ISBN;
	private int Id;
    private String titulo;
    private String autor;
    private int cantDisponible;
    
//    private Integer ejemplares;
//    private Integer ejemplaresPrestados;
//    private Integer ejemplaresRestantes;
//    private Boolean alta;
//    @ManyToOne
//    private Autor autor;
	
}
