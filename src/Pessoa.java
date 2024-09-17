import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    public String getDataDeNascimento()
    {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataDeNascimento.format(formatador);
        return data;

    }
    public String getNome()
    {
        return nome;
    }
    public double getPeso()
    {
        return peso;
    }
    public String getSexo()
    {
        String sexoString = "";
        if (this.sexo == false) {
            sexoString = "Masculino";
        } else {
            if (this.sexo == true) {
                sexoString = "Feminino";
            }
        }
        return sexoString;
    }
    //setters
    public void setAltura(double altura) {
        if (altura < 0) {
            
        } else {
            this.altura = altura;
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        LocalDate data;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data = LocalDate.parse(dataDeNascimento, formatador);
        this.dataDeNascimento = data;
    }
    public void setSexo(String sexo) {
        if (sexo == "m") {
            this.sexo = false;
        } else if (sexo == "f"){
            this.sexo = true;
        }
    }
    //construtores
    public Pessoa() {
    }
    public Pessoa(double altura, double peso, String nome, String dataDeNascimento, String sexo) {
        this.setAltura(altura);
        this.setPeso(peso);
        this.setNome(nome);
        this.setDataDeNascimento(dataDeNascimento);
        this.setSexo(sexo);
    }
    //metodos
    public void show() {
        System.out.println(" Altura     : " + getAltura()+ "\n Peso       : " +getPeso() + "\n Aniversario: " + getDataDeNascimento() + "\n Nome       : " +getNome() + "\n Sexo       : " + getSexo());
    }
}   
