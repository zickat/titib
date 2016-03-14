package projettitib.modif;

import javax.swing.table.DefaultTableModel;
import projettitib.classe.Couple;
import projettitib.classe.bon.Bon;
import projettitib.classe.titib.Titib;

/**
 *
 * @author Titi
 */
public class TableAchatBonModel extends DefaultTableModel {
    private final Couple couple ;
    private final Titib titibCo ;
    
    public TableAchatBonModel(Couple couple, Titib titibCo) {
        this.couple = couple ;
        this.titibCo = titibCo ;
        
        addColumn("Coût") ;
        addColumn("Nom") ;
        addColumn("Description") ;
        
        for (Bon bon : couple.getAutre(titibCo).getListeBons().getListeBons()) {
            addRow(new Object[] {bon.getCout(),bon.getNom(),bon.getDescription()}) ;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
