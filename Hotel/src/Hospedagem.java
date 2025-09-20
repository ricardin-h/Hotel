public class Hospedagem {
    private Hospede hospede;
    private Quarto quarto;

    public Hospedagem(Hospede hospede, Quarto quarto){
        this.hospede = hospede;
        this.quarto = quarto;

        this.quarto.setOcupado(true);

    }

    public Hospede getHospede(){
        return this.hospede;
    }


    public Quarto getQuarto(){
        return this.quarto;
    }

}
