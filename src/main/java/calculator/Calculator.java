package calculator;

public  class Calculator {


    public Double addition(Double arg1, Double arg2){
       return arg1+arg2;
    }

    public Double subtraction(Double arg1,Double arg2){
        return arg1 - arg2;
    }

    public Double multiplication(Double arg1,Double arg2){
        if(arg2 == 0){
            throw new ArithmeticException();
        } else
        return arg1 * arg2;
    }

    public Double divide (Double arg1,Double arg2){
        if(arg2 == 0){
            throw new ArithmeticException();
        } else
        return arg1 / arg2;
    }

    public Double degree(Double arg, Double degree){
        return Math.pow(arg,degree);
    }

    public Double sqrt(Double arg){
        if(arg<0){
            throw new RuntimeException();
        }else
        return Math.sqrt(arg);
    }


}
