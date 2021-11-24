package core

class Cliente {
    String nome;
    String cpf;
    Date dataNascimento;
    String classeSocial;


    static constraints = {
        classeSocial inList:["baixa","media","alta"]
    }
    static mapping ={
        table name: "cli_clientes"
    }
}
