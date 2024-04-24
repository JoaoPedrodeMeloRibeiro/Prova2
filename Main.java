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
