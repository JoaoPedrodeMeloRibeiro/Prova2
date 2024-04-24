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
public class Exercito extends Soldado{
    
    Soldado soldado = new soldado();
    string nome;
    
    
    
}

public class ItemEspecial{
    string tipo;
    
    
}
public class Sargento extends Soldado implements Defesa {
    string especializacao;
    int experienciaCombate;
    
    
    public void mostraInfo(){

        
    }
    public void usandoItem(){
        
    }
    
    
    
    
}
public class Oficial extends Soldado implements Defesa{
    string patente;
    
    public void mostraInfo(){
        
    }
    public void usandoItem(){
        
    }
    
    
}
public class MedicoMilitar extends Soldado implements Curar{
    int anosEsperiencia;
    int capacidadeEmergencia;
    
    public void mostraInfo(){
        
    }
    public void usandoItem(){
        
    }

    
    
}
public class Defesa {
    
    public void defender(){
        
    }
    
    
}

public class Curar{
    
    public void defender(){
        
    }
    
    
}

import java.util.Scanner;
class PV2 {
    public static void main(String[] args) {
        
        Soldado sargento = new Sargento(1,"Pecanha", 1337542);
        Soldado oficial = new Oficial(1,"Clovis", 556335);
        Soldado medico = new Medico(1,"Eusbio", 5567435);
        
        sargento.mostraInfo();
        oficial.mostraInfo();
        medico.mostraInfo();
        
    }
}
