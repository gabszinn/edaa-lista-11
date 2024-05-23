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
            scanner.close();
        }

        System.out.println("\nDados inseridos:");
        for (String cpf : cpfPhoneMap.keySet()) {
            System.out.println("CPF: " + cpf + " - Telefone: " + cpfPhoneMap.get(cpf));
        }
    }
}
