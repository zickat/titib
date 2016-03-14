package projettitib.classe;

import projettitib.classe.titib.Titib;
import projettitib.classe.titib.Amoureux;
import projettitib.classe.titib.Amoureuse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Titi
 */
public class Couple {
    Amoureux amoureux ;
    Amoureuse amoureuse ;
    
    public Couple(Amoureux amoureux, Amoureuse amoureuse) {
        this.amoureux = amoureux ;
        this.amoureuse = amoureuse ;
    }
    
    public Titib trouverTitib(String surnom, String mdp) {
        Titib titibATrouver = new Titib("", surnom, mdp, "") ;
        if (titibATrouver.equals(amoureux))
            return amoureux ;
        if (titibATrouver.equals(amoureuse))
            return amoureuse ;
        return null ;
    }
    
    public Amoureux getAmoureux() {
        return amoureux ;
    }
    
    public Amoureuse getAmoureuse() {
        return amoureuse ;
    }
    
    public Titib getAutre(Titib amoureu) {
        if (amoureu instanceof Amoureux)
            return amoureuse ;
        else if (amoureu instanceof Amoureuse)
            return amoureux ;
        return null ;
    }
}
