package classes;
/**
 *
 * @author renan
 */
public class Menus {
    public static void menuGeral(){
        System.out.println("________ Menu Geral ________ ");
        System.out.println("1 -  Cadastrar Curso");
        System.out.println("2 -  Cadastrar Aluno");
        System.out.println("3 -  Matricular");
        System.out.println("4 -  Imprimir Matriculas");
        System.out.println("5 -  Imprimir Cursos");
        System.out.println("6 -  Imprimir Alunos");
        System.out.println("7 -  Ler Arquivo Curso");
        System.out.println("8 -  Ler Arquivo Aluno");
        System.out.println("9 -  Ler Arquivo Matricula");
        System.out.println("10 - Salvar Arquivo Curso na Lista curso");
        System.out.println("11 - Salvar Arquivo Aluno na Lista aluno");
        System.out.println("12 - Salvar Arquivo Matricula na Lista matricula");
        System.out.println("0 - Sair");
    }
    public static void menuMatricula(){
        System.out.println(":::: Menu Matricula ::::");
        System.out.println("1 - Matricular");
        System.out.println("0 - Sair");
    }
    public static void menuCurso(){
        System.out.println(":::: Menu Curso ::::");
        System.out.println("1 - Cadastrar Curso");
        System.out.println("0 - Sair");
    }
    public static void menuAluno(){
        System.out.println(":::: Menu Aluno ::::");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("0 - Sair");
    }
}
