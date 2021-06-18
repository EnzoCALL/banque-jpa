package fr.diginamic.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "assuranceVie")
public class AssuranceVie extends Compte {

    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;

    //Constructeur
    public AssuranceVie(String numero, double solde, List<Operation> operations, List<Client> clients, LocalDate dateFin, double taux) {
        super(numero, solde, operations, clients);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    //Constructeur par défaut
    public AssuranceVie() {

    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}