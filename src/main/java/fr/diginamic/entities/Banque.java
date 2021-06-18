package fr.diginamic.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banque")
public class Banque {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "banque")
    private List<Client> clients;

    //Constructeur
    public Banque(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    //Constructeur par défaut
    public Banque() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}