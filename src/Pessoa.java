import java.time.LocalDate;

public class Pessoa
{
    private double altura;
    private double peso;
    private String nome;
    private LocalDate dataDeNascimento;
    private boolean sexo;
    //getters
    public double getAltura()
    {
        return altura;
    }
    public LocalDate getDataDeNascimento()
    {
        return dataDeNascimento;
    }
    public String getNome()
    {
        return nome;
    }
    public double getPeso()
    {
        return peso;
    }
    public boolean getSexo()
    {
        return sexo;
    }
    //setters
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        
        this.dataDeNascimento = dataDeNascimento;
    }
    public void setSexo(String sexo) {
        if (sexo == "m") {
            this.sexo = false;
        } else if (sexo == "f"){
            this.sexo = true;
        }
    }
    public Pessoa() {
    }
    public Pessoa(double altura, double peso, String nome, String dataDeNascimento, String sexo) {
        this.setAltura(altura);
        this.setPeso(peso);
        this.setNome(nome);
        this.setDataDeNascimento(dataDeNascimento);
        this.setSexo(sexo);
    }
    
}   
