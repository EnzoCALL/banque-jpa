package fr.diginamic.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "livretA")
public class LivretA extends Compte{
    @Column(name = "taux")
    private double taux;

    //Constructeur
    public LivretA(String numero, double solde, List<Operation> operations, List<Client> clients, double taux) {
        super(numero, solde, operations, clients);
        this.taux = taux;
    }

    //Constructeur par défaut
    public LivretA() {
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}