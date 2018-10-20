package com.sim.ws.SimProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Usuari {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String  CodUsuari;
    private String  nom;
    private String  cognoms;
    private Date    dataNaixement;
    private String  email;
    private String  paisDeNaixement;
    private String  paisDeResidencia;
    private String  Adreça;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodUsuari() {
        return CodUsuari;
    }

    public void setCodUsuari(String codUsuari) {
        CodUsuari = codUsuari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaisDeNaixement() {
        return paisDeNaixement;
    }

    public void setPaisDeNaixement(String paisDeNaixement) {
        this.paisDeNaixement = paisDeNaixement;
    }

    public String getPaisDeResidencia() {
        return paisDeResidencia;
    }

    public void setPaisDeResidencia(String paisDeResidencia) {
        this.paisDeResidencia = paisDeResidencia;
    }

    public String getAdreça() {
        return Adreça;
    }

    public void setAdreça(String adreça) {
        Adreça = adreça;
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "id=" + id +
                ", CodUsuari='" + CodUsuari + '\'' +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", email='" + email + '\'' +
                ", paisDeNaixement='" + paisDeNaixement + '\'' +
                ", paisDeResidencia='" + paisDeResidencia + '\'' +
                ", Adreça='" + Adreça + '\'' +
                '}';
    }
}
