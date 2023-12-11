import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // calculadora
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        calcs(num1, num2);

    }


    static void calcs(int num1, int num2) {
        var result_soma = num1 + num2;
        out.println("o resultado da soma é " +result_soma);
        traco();

        var result_sub = num1 - num2;
        out.println("o resultado da subtração é " +result_sub+ "("+num1+"-"+num2+")" );
        traco();

        var resultado_mult = num1 * num2;
        out.println("o resultado da multiplicação é " + resultado_mult);
        traco();

        var result_div = num1 / num2;
        out.println("o resultado da divisão é " +result_div);
        traco();

        if (num1 > num2) {
            out.println(num1 + "é maior que " + num2);
        } else {
            out.println(num2 + "é maior que " + num1);
        }
        traco();
        
        out.println("fim do programa simmmm");
    }
    static void traco(){

        out.println("--------------");
    }

}
