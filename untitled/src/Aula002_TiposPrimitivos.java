public class Aula002_TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10; // 4 bytes
        long numeroGrande = 100000; // 8 bytes
        double salarioDouble = 2000.00; // 8 bytes
        float salarioFLoat = 2000.00f; // 8 bytes
        byte idadeByte = 10; // 1 byte
        short idadeShort = 10; // 2 bytes
        boolean verdade = true; // 1 bit
        boolean falso = false; // 1bit
        char caractere = 'A'; // 2 bytes

        // Essas são a que você vai mais utilizar...

        // int...Só suporta númros inteitos...
        System.out.println("int" + idade);
        // double...double suporta números quebrados...
        System.out.println("double:" + salarioDouble);
        // boolean...boolean recebe true ou false...
        System.out.println("boolean:" + verdade);
        System.out.println("boolean:" + falso);

        // Normalmente menos uzadas no dias de hoje...

        // float...float suporta números quebrados mas você tem que adicionar um 'f' ou 'F'...
        System.out.println("float" + salarioFLoat);
        // byte...byte suporta número inteiros e so vai até 127...
        System.out.println("byte" + idadeByte);
        // short...short suporta apenas números inteiros e so vai até 3200...
        System.out.println("short" + idadeShort);
        // char...char apenas suporta uma letra ou os números coresponde a essa letra por exemplo '68 = A'...
        System.out.println("char" + caractere);
        // long...long suporta apens números inteiros e so vai até 32 bits...
        System.out.println("long" + numeroGrande);
    }
}