// Classe
public class Paciente {

    // Construtor
    public Paciente(){

    }
    public Paciente(String nome, int idade, char sexo, String laudo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.laudo = laudo;
    }
    
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    private String laudo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getLaudo() {
        return laudo;
    }
    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }
    
    // polimorfismo toString()
    @Override
    public String toString() {
        return "Paciente [idade=" + idade + ", laudo=" + laudo + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

   

}
