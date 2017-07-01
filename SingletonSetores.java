/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaPP;

/**
 *
 * @author Rafa
 */
public class SingletonSetores {
     private static SingletonSetores instancia;

    private String Nome;
    private int QtdFuncionarios;
    private String Supervisor;
    

    private SingletonSetores(){
    }

    public static SingletonSetores getInstancia(){
        if (instancia==null){
            instancia=new SingletonSetores();
        }
        return instancia;
    }

    public void autenticar(){
        Nome = "Estoque";
        Supervisor = "Joao";
        
        System.out.println ("-------Setores da Empresa-------");
        System.out.println("Setor: " + Nome);
        System.out.println("Supervisor: " + Supervisor);
        System.out.println ("---------------------------------");
        
    }

    /*
     * getters e setters e outros métodos
     */

}
    

