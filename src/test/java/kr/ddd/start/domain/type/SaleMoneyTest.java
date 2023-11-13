package kr.ddd.start.domain.type;

import kr.ddd.start.domain.type.test.SaleMoney;
import org.junit.jupiter.api.Test;

public class SaleMoneyTest {
    @Test
    void test() {
        final long money = 10000;
        System.out.println("origin money: " + SaleMoney.ORIGIN.calculate(money));
        System.out.println("supply money: " + SaleMoney.SUPPLY.calculate(money));
        System.out.println("vat money: " + SaleMoney.VAT.calculate(money));
    }
}
