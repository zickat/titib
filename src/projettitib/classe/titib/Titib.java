/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettitib.classe.titib;

import projettitib.classe.bon.Bon;
import projettitib.classe.bon.ListeBons;

/**
 *
 * @author Titi
 */
public class Titib {
    private String nom ;
    private String surnom ;
    private String mdp ;
    private String maison ;
    private ListeBons listeBons = new ListeBons() ;
    private ListeBons listeBonsAchetes = new ListeBons() ;
    private int nbPoints = 0 ;
    
    public Titib(String nom, String surnom, String mdp, String maison) {
        this.nom = nom ;
        this.surnom = surnom ;
        this.mdp = mdp ;
        this.maison = maison ;
    }

    public String getNom() {
        return nom;
    }

    public String getSurnom() {
        return surnom;
    }

    public String getMdp() {
        return mdp;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Titib) {
            Titib titibComp = (Titib) o ;
            return (surnom.equals(titibComp.getSurnom()) && mdp.equals(titibComp.getMdp())) ;
        }
        return false ;
    }
    
    @Override
    public String toString() {
        return nom ;
    }
    
    public String getMaison() {
        return maison ;
    }

    public ListeBons getListeBons() {
        return listeBons;
    }

    public int getNbPoints() {
        return nbPoints;
    }
    
    public void ajouterPoints(int points) {
        nbPoints += points ;
    }
    
    public void retirerPoints(int points) {
        nbPoints -= points ;
    }
    
    public boolean acheterBon(Bon bon, Titib titibInLove) {
        if (nbPoints >= bon.getCout()) {
            listeBonsAchetes.ajouterBon(bon) ;
            nbPoints -= bon.getCout() ;
            titibInLove.getListeBons().supprimerBon(bon);
            return true ;
        }
        return false ;
    }

    public ListeBons getListeBonsAchetes() {
        return listeBonsAchetes;
    }
}
