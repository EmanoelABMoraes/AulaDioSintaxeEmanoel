import java.util.Scanner;

public class ContaTerminal {
    int Numero; //1021
    String Agencia; //067-8
    String NomeCliente; //Emanoel Moraes
    Double Saldo;// 237,48

    public void entradadDados(){
        Scanner lerDD = new Scanner(System.in);

        System.out.printf("Favor Inserir sua Conta(4 digitos): ");
        Numero = lerDD.nextInt();
        System.out.println("Favor Inserir sua Agencia(4 digitos): ");
        Agencia = lerDD.next();
        System.out.println("Favor Inserir seu Nome: ");
        NomeCliente = lerDD.next();
        System.out.printf("Favor Inserir seu Deposito: ");
        Saldo = lerDD.nextDouble();
        
        lerDD.close();
    }
    public void saidaDados(){
        System.out.print("Olá " +NomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia é "+Agencia+" , conta é "+Numero+
            " e seu saldo é R$ "+Saldo+" já esta disponivel para saque." 
        
        );
    }

}
