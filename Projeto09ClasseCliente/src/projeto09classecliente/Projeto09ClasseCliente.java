/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author aluno
 */
public class Projeto09ClasseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Um OBEJETO c1 do tipo da classe Cliente, sendo instanciado por meio do
        // operador new que chama o método Contrutor Cliente()

        
        Cliente c1 = new Cliente("549951x", "Thiago", "84669-56", "Pirajuí", "SP");
        c1.setRG("9999x");
        System.out.println(c1.getRG());
        System.out.println(c1.getNome());
        System.out.println(c1.getCPF());
        System.out.println(c1.getCidade());
        System.out.println(c1.getEstado());

    }
}
