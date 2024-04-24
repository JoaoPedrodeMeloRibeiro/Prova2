public abstract class Soldado{
    
     int qtdSoldado;
     string nome;
     long cpf;
     
      public Soldado(int qtdSoldado,String nome, long cpf){
        this.qtdSoldado = qtdSoldado;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostraInfo(){
        System.out.println("Dados da classe Soldado");
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("qtdSoldado: " + this.qtdSoldado);
        

    }
    public void usandoItem(){
        
        
        
    }
    
    
}
