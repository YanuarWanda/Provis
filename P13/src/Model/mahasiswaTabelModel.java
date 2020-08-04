package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author Yanuar Wanda Putra
 */
public class mahasiswaTabelModel extends AbstractTableModel{
    private ArrayList<mahasiswa> data;
    private String[] namaField ={"NIM", "Nama", "Jenis Kelamin", "Tinggi"};
    
    public void setData(ArrayList<mahasiswa> data) {
        this.data = data;
    }
    
    @Override
    public int getColumnCount() {
        return namaField.length;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        mahasiswa m = data.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getNim();
            case 1: return m.getNama();
            case 2: return m.getJenisKelamin();
            case 3: return m.getTinggi();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }
}
