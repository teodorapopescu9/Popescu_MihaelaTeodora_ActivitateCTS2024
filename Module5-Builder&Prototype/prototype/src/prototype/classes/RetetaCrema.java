package prototype.classes;

public class RetetaCrema implements RetetaAbstracta{
    private int cantitate;
    private String nume;

    public RetetaCrema(int cantitate, String nume) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    public RetetaCrema() {
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "cantitate=" + cantitate +
                ", nume='" + nume + '\'' +
                '}';
    }


    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema  = new RetetaCrema();
        retetaCrema.setCantitate(this.getCantitate());
        retetaCrema.setNume(this.getNume());
        return retetaCrema;
    }
}
