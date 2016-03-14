package projettitib.modif;

import javax.swing.table.DefaultTableModel;
import projettitib.classe.Couple;
import projettitib.classe.bon.Bon;
import projettitib.classe.titib.Titib;

/**
 *
 * @author Titi
 */
public class TableVenteBonModel extends DefaultTableModel {
    private Titib titibCo ;
    
    public TableVenteBonModel(Titib titibCo) {
        this.titibCo = titibCo ;
        
        addColumn("Coût") ;
        addColumn("Nom") ;
        addColumn("Description") ;
        
        for (Bon bon : titibCo.getListeBons().getListeBons()) {
            addRow(new Object[] {bon.getCout(),bon.getNom(),bon.getDescription()}) ;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column) {
        String nom = (String) getValueAt(row, 1) ;
        int cout = (Integer) getValueAt(row, 0) ;
        Bon bon = titibCo.getListeBons().trouverBon(nom, cout) ;
        switch (column) {
            case 0 : bon.setCout((Integer) aValue);
                    break ;
            case 1 : bon.setNom((String) aValue);
                    break ;
            case 2 : bon.setDescription((String) aValue);
                    break ;
            default : break ;
        }
        super.setValueAt(aValue, row, column);
    }
    
    @Override
      public Class getColumnClass(int col) {
          if (col == 0)
              return Integer.class ;
          else
              return String.class ;
    }
}
