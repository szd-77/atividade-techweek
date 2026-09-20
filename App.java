import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Etapa 1: A Preparação
        Scanner leitor = new Scanner(System.in);
        
        int conexS = 0;   // Contador para positivos
        int conexN = 0;   // Contador para negativos

        System.out.println("SISTEMA DE SEGURANÇA E IDENTIFICAÇÃO DE PACOTE: ");
        System.out.println("Nome do Usuário: ");
        String nome = leitor.nextLine();
        System.out.println("Insira os 5 pacotes para verificação:");

        // Etapa 2: O Motor do Programa

        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite o código do pacote " + contador + " : ");
            int codigoPacote = leitor.nextInt();

            if (codigoPacote > 0) {
                conexS++;
            } else if (codigoPacote < 0) {
                conexN++;
            }
        }

                // Saída do Relatório 3 parte

            double taxaS = ((conexS/ 5.0) * 100);

        System.out.println("=== RELATÓRIO FINAL ===");
        System.out.println("Nome do Usuário: " + nome);
        System.out.println("Total de conexões seguras (positivos): " + conexS);
        System.out.println("Total de ameaças bloqueadas (negativos): " + conexN);
        System.out.println("Taxa de conexões seguras: " +  taxaS + "%");
        

        leitor.close();
    }
}
