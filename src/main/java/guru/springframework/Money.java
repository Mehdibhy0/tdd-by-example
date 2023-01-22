package guru.springframework;

public abstract class Money {

    public abstract Money times(int Multiplier);
    protected int amount;
    public static Dollar dollar(int amount){
        return new Dollar(amount);
    }
    public static Franc franc(int amount){
        return new Franc(amount);
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount ==money.amount && this.getClass().equals(object.getClass());
    }
}
