package com.github.filipmikolajzeglen.classes;

import com.github.filipmikolajzeglen.interfaces.RequiredOperations;

public class Operator implements RequiredOperations {

    Calculator action = new Calculator();

    @Override
    public void doOperation(String operation, double value) {
        switch (operation.toUpperCase()) {
            case "ADD":
                action.add(value);
                break;
            case "MULTIPLY":
                action.multiply(value);
                break;
            case "SUBTRACT":
                action.subtract(value);
                break;
            case "DIVIDE":
                action.divide(value);
                break;
            case "APPLY":
                action.apply(value);
                break;
            default:
                break;
        }
    }
}
