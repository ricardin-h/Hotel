    public class Quarto {
        private int numero;
        private String tipo;
        private double precoPorNoite;
        private boolean ocupado;
        private Hospede hospede;

        public Quarto(int numero, String tipo, double precoPorNoite, boolean ocupado){
            this.numero = numero;
            this.tipo = tipo;
            this.precoPorNoite = precoPorNoite;
            this.ocupado = ocupado;
            this.hospede = null;
        }

        public int getNumero(){
            return this.numero;
        }

        public String getTipo(){
            return this.tipo;
        }

        public double getPrecoPorNoite(){
            return this.precoPorNoite;
        }

        public boolean isOcupado(){
            return this.ocupado;
        }

        public void setOcupado(boolean ocupado){
            this.ocupado = ocupado;
        }

        public void chekin(Hospede hospede){
            if(!ocupado){
                this.hospede = hospede;
                this.ocupado = true;
                System.out.println(" Feito chekin no quarto " +numero);
            }
        }
        public void chekout(){
            if (ocupado) {
            System.out.println("Feito o chekout do quarto " + numero);
            this.hospede = null;
            this.ocupado = false;
            System.out.println(" Feito chekout do quarto " +numero);
            } else
                System.out.println(" O quarto já esta livre! ");

        }
    }
