package fr.diginamic.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "virement")
public class Virement extends Operation{

    @Column(name = "beneficiaire")
    private String beneficiaire;

    //Constructeur
    public Virement(LocalDate date, double montant, String motif, Compte compte, String beneficiaire) {
        super(date, montant, motif, compte);
        this.beneficiaire = beneficiaire;
    }

    //Constructeur par défaut
    public Virement() {
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}