import java.math.BigDecimal;

public class PjConta implements Conta{

    private String accountNumber;
    private String name;
    private String type;
    private BigDecimal fees;

    public PjConta(String accountNumber, String name, String type, BigDecimal fees) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.type = type;
        this.fees = fees;
    }

    public PjConta() {

    }

    @Override
    public PjConta setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

        return this;
    }

    @Override
    public PjConta setName(String name) {
        this.name = name;

        return this;
    }

    @Override
    public PjConta setType(String type) {
        this.type = type;

        return this;
    }

    @Override
    public PjConta setFees(BigDecimal fees) {
        this.fees = fees.multiply(BigDecimal.valueOf(0.01));

        return this;
    }

    public static PjConta builder(){
        return new PjConta();
    }

    public PjConta build(){
        return new PjConta(accountNumber, name, type, fees);
    }

    @Override
    public String toString() {
        return "PjConta{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", fees=" + fees +
                '}';
    }
}
