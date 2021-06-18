package fr.diginamic.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private double solde;

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;

    @ManyToMany
    @JoinTable(name="client_compte",
            joinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
    private List<Client> clients;

    //Constructeur
    public Compte(String numero, double solde, List<Operation> operations, List<Client> clients) {
        this.numero = numero;
        this.solde = solde;
        this.operations = operations;
        this.clients = clients;
    }

    //Constructeur par défaut
    public Compte() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}