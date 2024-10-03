package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0){
            throw  new DivisionByZeroException("No se puede dividir entre 0");
        }else {
            return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        try{
            int value = divisionWithCustomException(4, 2);
            System.out.println("Resultado: " + value);
            int value1 = divisionWithCustomException(4, 0);
            System.out.println("Resultado: " + value1);
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
