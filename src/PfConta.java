import java.math.BigDecimal;

public class PfConta implements Conta{

    private String accountNumber;
    private String name;
    private String type;
    private BigDecimal fees;

    public PfConta(String accountNumber, String name, String type, BigDecimal fees) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.type = type;
        this.fees = fees;
    }

    public PfConta() {
    }

    @Override
    public PfConta setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

        return this;
    }

    @Override
    public PfConta setName(String name) {
        this.name = name;

        return this;
    }

    @Override
    public PfConta setType(String type) {
        this.type = type;

        return this;
    }

    @Override
    public PfConta setFees(BigDecimal fees) {
        this.fees = fees.multiply(BigDecimal.valueOf(0.02));

        return this;
    }

    public static PfConta builder(){
        return new PfConta();
    }

    public PfConta build(){
        return new PfConta(accountNumber, name, type, fees);
    }

    @Override
    public String toString() {
        return "PfConta{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", fees=" + fees +
                '}';
    }
}
