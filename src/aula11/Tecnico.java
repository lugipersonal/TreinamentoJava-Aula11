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
public class Tecnico extends Aluno {
    
    private int registroProfissional;

    @Override
    public String toString() {
        return "Tecnico{" + "registroProfissional=" + registroProfissional + '}';
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){
        
    }
    
}
