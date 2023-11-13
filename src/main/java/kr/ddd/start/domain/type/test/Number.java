package kr.ddd.start.domain.type.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum Number {
    AVG("평균", Number::getAverage),
    SUM("합계", Number::getSum);


    private final String name;
    private final Function<List<Integer>, Integer> expression;

    Number(String name, Function<List<Integer>, Integer> expression) {
        this.name = name;
        this.expression = expression;
    }

    private static Integer getAverage(List<Integer> list) {
        return getSum(list) / list.size();
    }

    private static Integer getSum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }

    private Integer calculate(List<Integer> list) {
        return expression.apply(list);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("average: " + Number.AVG.calculate(input));
        System.out.println("sum: " + Number.SUM.calculate(input));
    }
}
