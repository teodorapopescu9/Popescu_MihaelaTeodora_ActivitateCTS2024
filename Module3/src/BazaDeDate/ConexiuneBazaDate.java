package BazaDeDate;

public class ConexiuneBazaDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDate instanta = null;

    private ConexiuneBazaDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public static synchronized ConexiuneBazaDate getInstance(String nume, int nr, String link) {
        if (instanta == null) {
            instanta = new ConexiuneBazaDate(nume, nr, link);
        }
        return instanta;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static ConexiuneBazaDate getInstanta() {
        return instanta;
    }

    public static void setInstanta(ConexiuneBazaDate instanta) {
        ConexiuneBazaDate.instanta = instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }
}
