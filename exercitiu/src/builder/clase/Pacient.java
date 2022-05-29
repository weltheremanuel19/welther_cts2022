package builder.clase;

//builder

public class Pacient {
    private boolean salvarePacient;

    private boolean patRabatabil;

    private boolean micDejun;

    private boolean papuciCamera;

    private boolean halat;

    @Override
    public String toString() {
        return "Pacient{" +
                "salvarePacient=" + salvarePacient +
                ", patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halat=" + halat +
                '}';
    }

    public Pacient(BuilderPacient builderPacient) {
        this.salvarePacient = builderPacient.salvarePacient;
        this.patRabatabil = builderPacient.patRabatabil;
        this.micDejun = builderPacient.micDejun;
        this.papuciCamera = builderPacient.papuciCamera;
        this.halat = builderPacient.halat;
    }

    public static class BuilderPacient{

        private boolean salvarePacient;

        private boolean patRabatabil;

        private boolean micDejun;

        private boolean papuciCamera;

        private boolean halat;

        public BuilderPacient(boolean salvarePacient) {
            this.salvarePacient = salvarePacient;
        }

        public BuilderPacient setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public BuilderPacient setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }

        public BuilderPacient setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        public BuilderPacient setHalat(boolean halat) {
            this.halat = halat;
            return this;
        }

      public Pacient build(){
            return new Pacient(this);
      }
        }
    }



