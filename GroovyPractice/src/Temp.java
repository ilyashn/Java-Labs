import java.math.BigDecimal;

public class Temp {
    public void check() {
        String str = "str";
        //System.out.println(str instanceof Integer);
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(100);
        BigDecimal bigDecimal2 = bigDecimal.add(bigDecimal1);
        //BigDecimal bigDecimal3 = bigDecimal + bigDecimal1;
    }
}
