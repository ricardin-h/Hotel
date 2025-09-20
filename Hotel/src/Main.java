import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //dados do hotel
            Hotel hotel = new Hotel(" Grand Hotel Maringá ", " rua pioneiro");

            //dados quarto;
            Quarto q1 = new Quarto(1, "Standard", 150.50, false );
            Quarto q2 = new Quarto(2, "Deluxe", 185.50, false );
            Quarto q3 = new Quarto(3, "Suíte", 200.50, false );
            //cria quartos
            hotel.addQuarto(q1);
            hotel.addQuarto(q2);
            hotel.addQuarto(q3);
            //gera relatorio dos quartos
            hotel.relatorioDeQuartos();

            //passagem de dados do hospede
            for(int i = 0; i <2; i++) {
                System.out.println("\nCadastro do hóspede " + (i + 1));
                System.out.println(" Informe seu nome:");
                String nome = input.nextLine();

                System.out.println(" Informe seu cpf:");
                String cpf = input.nextLine();

                Hospede hospede = new Hospede(nome, cpf);

                boolean hospedado = false;
                while(!hospedado){
                    System.out.println(" Informe o numero do quarto que deseja: (1, 2 e 3)");
                    int numero = input.nextInt();
                    input.nextLine();

                for(Quarto quarto :hotel.getQuartos()){
                    if(quarto.getNumero() == numero){
                        if(!quarto.isOcupado()){
                            quarto.chekin(hospede);
                            hospedado = true;
                            break;
                        }else{
                            System.out.println(" O quarto " +numero + " esta ocupado, por gentileza escolha outro quarto ");
                            }
                        }
                    }
                }
            }
            hotel.relatorioDeQuartos();
            System.out.println(" Qual quarto deseja fazer chekout: ");
            int numero = input.nextInt();
            input.nextLine();

        for(Quarto quarto :hotel.getQuartos()){
            if(quarto.getNumero() == numero){
                quarto.chekout();
            }
        }
        hotel.relatorioDeQuartos();
    }
}