package projettitib.classe.bon;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Titi
 */
public class ListeBons {
    Set<Bon> listeBons = new TreeSet<>() ;
    
    public void ajouterBon(Bon bon) {
        listeBons.add(bon) ;
    }
    
    public void supprimerBon(Bon bon) {
        if (listeBons.contains(bon))
            listeBons.remove(bon) ;
    }
    
    public Bon trouverBon(String nom, int cout) {
        Bon bonATrouver = new Bon(nom, cout, "") ;
        for (Bon bon : listeBons) {
            if (bonATrouver.equals(bon))
                return bon ;
        }
        return null ;
    }

    public Set<Bon> getListeBons() {
        return listeBons;
    }

    public Bon[] getTableauListeBons() {
        Bon[] tableau = null ;
        listeBons.toArray(tableau) ;
        return tableau ;
    }
}
