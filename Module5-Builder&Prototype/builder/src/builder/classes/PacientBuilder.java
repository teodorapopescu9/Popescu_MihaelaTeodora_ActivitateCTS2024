package builder.classes;

public class PacientBuilder implements Builder {
    Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient(false, false, false, false);
    }


    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamere(boolean papuciDeCamere) {
        pacient.setPapuciDeCamere(papuciDeCamere);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }

}
