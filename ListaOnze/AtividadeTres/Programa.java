import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        HashMap<String, String> cpfPhoneMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o CPF (somente números):");
            String cpf = scanner.nextLine();
            System.out.println("Digite o telefone:");
            String phone = scanner.nextLine();
            cpfPhoneMap.put(cpf, phone);
        }

        System.out.println("\nDados inseridos:");
        for (String cpf : cpfPhoneMap.keySet()) {
            System.out.println("CPF: " + cpf + " - Telefone: " + cpfPhoneMap.get(cpf));
        }
        while (true) {
            System.out.println("\nDigite um CPF para pesquisar o telefone (ou 'sair' para encerrar):");
            String searchCpf = scanner.nextLine();

            if (searchCpf.equalsIgnoreCase("sair")) {
                break;
            }

            String phone = cpfPhoneMap.get(searchCpf);
            if (phone != null) {
                System.out.println("Telefone para o CPF " + searchCpf + ": " + phone);
            } else {
                System.out.println("CPF não encontrado.");
            }
        }

        scanner.close();
    }
}
