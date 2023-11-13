package kr.ddd.start.domain.type.test;

import java.util.function.Function;

/**
 * enum example
 * https://velog.io/@kyle/Java-Enum-%EC%82%AC%EC%9A%A9-2%ED%83%84
 */
public enum SaleMoney {
    ORIGIN("매출액", origin -> origin),
    SUPPLY("공급액", origin -> Math.round(origin.doubleValue()) * 10 / 11),
    VAT("부가세", origin -> origin / 11),
    NOTHING("없음", origin -> 0L);
    private final String name;
    private final Function<Long, Long> expression;

    SaleMoney(String name, Function<Long, Long> expression) {
        this.name = name;
        this.expression = expression;
    }

    public long calculate(long origin) {
        return expression.apply(origin);
    }
}
