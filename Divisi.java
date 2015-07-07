import java.util.ArrayList;

/**
 * Created by USER on 7/7/2015.
 */
import java.util.ArrayList;

public class Divisi {
    private String namaDivisi;
    private Liga liga;

    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    //Constructor
    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Liga getLiga(){
        return liga;
    }

    public void setDaftarKlub(Klub klub) {

        this.daftarKlub.add(klub);
    }

    public ArrayList<Klub> getDaftarKlub() {

        return daftarKlub;
    }

    //test nomer 2

    public void getDaftarKlubLiga(String cariLiga)
    {
        if (cariLiga == liga.getNamaLiga())
        {
            for (int i = 0; i < liga.daftarDivisi.size() ; i++)
            {
                Divisi l = liga.daftarDivisi.get(i);
                System.out.println(l.getNamaDivisi());
                for (int j = 0; j <daftarKlub.size() ; j++)
                {
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        else
        {
            System.out.println("Tidak ada Klub di Liga ini");
        }
    }

    //test nomer 3
    public void getDaftarKlubDivisi(String divisiCari)
    {
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(i);
            if (divisiCari == l.getNamaDivisi())
            {
                for (int j = 0; j <daftarKlub.size() ; j++)
                {
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(0);
            Divisi k = liga.daftarDivisi.get(1);
            if (divisiCari != k.getNamaDivisi())
            {
                if (divisiCari != l.getNamaDivisi())
                {
                    System.out.println("Klub tak dapat ditemukan");
                    break;
                }
            }
        }

    }

    //toString
    @Override
    public String toString() {
        return
                "Nama Divisi = " + namaDivisi;
    }

}
