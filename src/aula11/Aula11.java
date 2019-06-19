/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author lucio.rodrigues
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Almeida");
        p1.setIdade(65);
        p1.setSexo("M");
        p1.setSalario(5000);
        p1.setEspecialidade("Banco de Dados");
        System.out.println(p1.toString());
        p1.receberAumento(333);
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Genilson");
        t1.setRegistroProfissional(12345);
        System.out.println(t1.toString());
        
        
        
    }
    
}
