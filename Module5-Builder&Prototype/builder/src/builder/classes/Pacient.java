package builder.classes;

public class Pacient {

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamere;
    private boolean halatPentruInterior;

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamere, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamere = papuciDeCamere;
        this.halatPentruInterior = halatPentruInterior;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

     void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

     void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public boolean isPapuciDeCamere() {
        return papuciDeCamere;
    }

     void setPapuciDeCamere(boolean papuciDeCamere) {
        this.papuciDeCamere = papuciDeCamere;
    }

    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
    }

     void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamere=" + papuciDeCamere +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }
}
