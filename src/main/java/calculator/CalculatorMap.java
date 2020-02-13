/*
 * Copyright (c) 2019 by tiger,DDoring
 * All rights reserved.
 *
 * CalculatorMap.java
 * 사칙연산과 함수를 Mapping하는 클래스
 *
 * @author      tiger,DDoring
 * @version     1.0
 * @date        09 Feb 2020
 *
 */

package calculator;

import java.util.HashMap;

public class CalculatorMap {
    private static HashMap<String, Operator> operators = new HashMap<>();

    {
        operators.put("+", new Plus());
        operators.put("-", new Minus());
        operators.put("*", new Multiply());
        operators.put("/", new Divide());
    }

    public static double calculate(String op, double x, double y) {
        return operators.get(op).Operate(x, y);
    }
}
