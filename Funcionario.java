public class Funcionario{

    private int id;
    private Double salario;
    private String nome;

    public Funcionario(int id, String nome, Double salario){
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public void status(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + this.salario);
    }

    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

    public void aumentarSalario(Double porcentagem){
        this.salario += salario * (porcentagem / 100);
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    public Double getSalario(){
        return this.salario;
    }
    public int getId(){
        return this.id;
    }

}