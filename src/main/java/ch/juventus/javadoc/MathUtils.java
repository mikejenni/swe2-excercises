package ch.juventus.javadoc;
import java.util.List;
public class MathUtils {


    public double addition(List<Double> numbers){
        double sum = 0;
        for(double num : numbers){
            sum += num;

        }
        return sum;
    }

    public double addition(double a, double b){
        return a+b;
    }

    public double substraction(double a, double b){
        return a-b;
    }

    public double division(double a, double b){
        return a/b;
    }

    public double multiplication(double a, double b){
        return a*b;
    }






}