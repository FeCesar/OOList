import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários irão ser registrados? ");
        int numeroRegistros = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for(int funcionario = 0; funcionario < numeroRegistros; funcionario++){

            System.out.println("Funcionário #" + (funcionario + 1));

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            
            Funcionario func = new Funcionario(id, nome, salario);
            
            funcionarios.add(func);

        }

        System.out.println();
        System.out.println("Digite o ID do funcionário que irá receber o aumento: ");
        int id = sc.nextInt();

        Integer pos = position(funcionarios, id);

        if(pos == null){

            System.out.println("Id Inválido!");

        } else{

            System.out.println("Digite a porcentagem de aumento: ");
            Double percent = sc.nextDouble();

            funcionarios.get(pos).aumentarSalario(percent);

        }

        System.out.println();
        System.out.println("Lista de Funcionários: ");

        for(Funcionario func : funcionarios){
            System.out.println(func.toString());
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> list, int id){

        for(int i = 0; i < list.size(); i++){

            if(list.get(i).getId() == id){
                return i;
            }

        }

        return null;

    }

}
