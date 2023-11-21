package com.primora.gestmag.models;
import javax.persistence.*;

@Entity
@Table(name = "employes")
public class Employe {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private int salaire;
    private String city;

}
