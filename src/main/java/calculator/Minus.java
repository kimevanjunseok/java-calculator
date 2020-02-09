/*
 * Copyright (c) 2019 by tiger,DDoring
 * All rights reserved.
 *
 * Minus.java
 * 빼기를 담당하는 클래스
 *
 * @author      tiger,DDoring
 * @version     1.0
 * @date        09 Feb 2020
 *
 */

package calculator;

public class Minus implements Operator {
    public double getOperatedValue(double x, double y) {
        return x - y;
    }
}
