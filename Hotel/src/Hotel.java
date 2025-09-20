    import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;


    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quarto>();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public ArrayList<Quarto> getQuartos(){
        return this.quartos;
    }


    public void addQuarto(Quarto q){
        this.quartos.add(q);
    }


    public void relatorioDeQuartos() {
        System.out.println(" Relatorio de quartos do Hotel " + this.nome + ".");
        for (Quarto q : quartos) {
            System.out.println(" Quarto " + q.getNumero() + " " + q.getTipo() + " tem o preço de " + q.getPrecoPorNoite() +
                    " por noite, ocupado " + q.isOcupado());
            }
        }
    }
