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
    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }
    public boolean isPapuciDeCamere() {
        return papuciDeCamere;
    }
    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
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

    public static class PacientBuilder implements Builder{
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamere;
        private boolean halatPentruInterior;

        public PacientBuilder() {
            this.patRabatabil = false;
            this.micDejunInclus = false;
            this.papuciDeCamere = false;
            this.halatPentruInterior = false;
        }


        @Override
        public Pacient build() {
            return new Pacient(patRabatabil, micDejunInclus, papuciDeCamere, halatPentruInterior);
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus=micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciDeCamere(boolean papuciDeCamere) {
            this.papuciDeCamere=papuciDeCamere;
            return this;
        }

        public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
            this.halatPentruInterior=halatPentruInterior;
            return this;
        }

    }
}
