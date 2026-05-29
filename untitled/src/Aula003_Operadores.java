public class Aula003_Operadores {
    public static void main(String[] args) {
        /* + ...soma e junção de strings,
           - ...subtração,
           /...divisao,
           *...multiplicação.
        */
        int a = 10;
        int b = 20;
        double resultado = a / (double) b;
        System.out.println(resultado);

        // %...Resto de uma divisão...
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores Lógicos...

        int idade = 20;
        int salario = 3500;
        boolean maiorQueTrinta = idade >= 30 && salario >= 5000;
        boolean menorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Se o salário esta na leia de com a idade sendo maior ou igual a 30 anos..." + maiorQueTrinta);
        System.out.println(("Se o salario esta na leie de acordo com a idade sendo menor de 30 anos..." + menorQueTrinta));
    }
}
