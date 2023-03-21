import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Conta contaPj = PjConta.builder()
                .setName("Gustavo")
                .setAccountNumber("41515184")
                .setFees(BigDecimal.valueOf(100))
                .setType("PJ")
                .build();

        Conta contaPf = PfConta.builder()
                .setName("Ferreira")
                .setAccountNumber("48489494")
                .setFees(BigDecimal.valueOf(100))
                .setType("PF")
                .build();

        List<Conta> contas = new ArrayList<>() {{
            add(contaPj);
            add(contaPf);
        }};

        contas.forEach(System.out::println);

    }
}