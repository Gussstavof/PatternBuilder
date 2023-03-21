import java.math.BigDecimal;

public interface Conta {
    Conta setAccountNumber(String accountNumber);
    Conta setName(String name);
    Conta setType(String type);
    Conta setFees(BigDecimal fees);
}
