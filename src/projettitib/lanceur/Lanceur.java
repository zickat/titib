package projettitib.lanceur;

import javax.swing.UIManager;
import projettitib.IHM.Connexion;
import projettitib.classe.titib.Amoureux;
import projettitib.classe.titib.Amoureuse;
import projettitib.classe.Couple;
import projettitib.classe.bon.Bon;

/**
 *
 * @author Titi
 */
public class Lanceur {
    
    public static void main(String[] args) {
        Amoureux tib = new Amoureux("Tib'<3 le Pirate d'Amour", "Tib", "tib", "Gryffondor") ;
        Amoureuse titi = new Amoureuse("Titi", "Titi", "titi", "Serdaigle") ;
        Bon bon1 = new Bon("test1", 10, "") ;
        Bon bon2 = new Bon("test2", 10, "") ;
        Bon bon3 = new Bon("test3", 15, "") ;
        Bon bon4 = new Bon("test4", 20, "") ;
        titi.getListeBons().ajouterBon(bon1);
        titi.getListeBons().ajouterBon(bon2);
        titi.getListeBons().ajouterBon(bon3);
        titi.getListeBons().ajouterBon(bon4);
        tib.getListeBons().ajouterBon(new Bon("fesse", 10, ""));
        Couple amoureux = new Couple(tib,titi) ;
        
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
}
        
        new Connexion(amoureux).setVisible(true) ;
    }
}
