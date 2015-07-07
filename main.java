/**
 * Created by - TOSHIBA - on 07/07/2015.
 */
public class main {
    public static void main(String[] args) {

        //Liga
        Liga mesin = new Liga("mesin");
        Liga akutansi = new Liga("akutansi");

        //Divisi
        Divisi rekayasa = new Divisi("rekayasa",mesin);
        Divisi teknik = new Divisi("teknik",mesin);
        Divisi praktikum = new Divisi("praktikum",akutansi);

        //Klub
        Klub mesinberat = new Klub("mesinberat",rekayasa,mesin);
        Klub mesinringan = new Klub("mesinringan",rekayasa,mesin);
        Klub mur = new Klub("mur",teknik,mesin);
        Klub tang = new Klub("tang",teknik,mesin);
        Klub makro = new Klub("makro",praktikum,akutansi);
        Klub mikro = new Klub("mikro",praktikum,akutansi);


        mesin.setDaftarDivisi(rekayasa);
        mesin.setDaftarDivisi(teknik);
        akutansi.setDaftarDivisi(praktikum);


        rekayasa.setDaftarKlub(mesinberat);
        rekayasa.setDaftarKlub(mesinringan);
        teknik.setDaftarKlub(mur);
        teknik.setDaftarKlub(tang);
        praktikum.setDaftarKlub(makro);
        praktikum.setDaftarKlub(mikro);


        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga mesin : ");
        mesin.getDaftarDivisi("mesin");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga mesin : ");
        rekayasa.getDaftarKlubLiga("mesin");
        System.out.println("Liga akutansi : ");
        praktikum.getDaftarKlubLiga("akutansi");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("rekayasa : ");
        rekayasa.getDaftarKlubDivisi("rekayasa");
        System.out.println("teknik : ");
        teknik.getDaftarKlubDivisi("teknik");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        mesinberat.getDivisi("mesinberat");
        tang.getDivisi("tang");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        tang.getLiga("tang");
    }
}
