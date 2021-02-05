package com.github.filipmikolajzeglen.classes;

import java.util.ArrayList;
import com.github.filipmikolajzeglen.interfaces.BasicMathOperation;
import static com.github.filipmikolajzeglen.classes.Utils.println;

public class Calculator implements BasicMathOperation {

    private double result = 0;

    @Override
    public double add(double value) {
        println("ADD: " + value);
        return this.result += value;
    }

    @Override
    public double multiply(double value) {
        println("MULTIPLY: " + value);
        return this.result *= value;
    }

    @Override
    public double subtract(double value) {
        println("SUBTRACT: " + value);
        return this.result -= value;
    }

    @Override
    public double divide(double value) {
        if (value != 0) {
            println("DIVIDE: " + value);
            return this.result /= value;
        } else {
            println("We don't divide by 0!");
            return this.result;
        }
    }

    @Override
    public double apply(double value) {
        this.result += value;
        println("APPLY: " + value + "\n\nOutput: " + this.result);
        return this.result;
    }

    protected static ArrayList<String> operations() {
        ArrayList<String> operationsList = new ArrayList<>();
        operationsList.add("Add");
        operationsList.add("Multiply");
        operationsList.add("Subtract");
        operationsList.add("Divide");
        operationsList.add("Apply");
        return operationsList;
    }

}
