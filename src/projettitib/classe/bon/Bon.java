package projettitib.classe.bon;

/**
 *
 * @author Titi
 */
public class Bon implements Comparable<Bon> {
    private int cout ;
    private String nom ;
    private String description ;
    
    public Bon(String nom, int cout, String description) {
        this.nom = nom ;
        this.cout = cout ;
        this.description = description ;
    }

    public int getCout() {
        return cout;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Bon) {
            Bon bon = (Bon) o ;
            return (nom.equals(bon.getNom()) && new Integer(cout).equals(bon.getCout())) ;
        }
        return false ;
    }

    @Override
    public int compareTo(Bon o) {
        int resultat = new Integer(cout).compareTo(o.getCout()) ;
        if (resultat == 0)
            resultat = nom.compareTo(o.getNom()) ;
        return resultat ;
    }
    
    @Override
    public String toString() {
        return nom+" "+"("+description+")" ;
    }
}
