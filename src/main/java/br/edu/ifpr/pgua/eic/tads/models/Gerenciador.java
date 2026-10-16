package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.models.entities.Usuario;

public class Gerenciador {
    
    private ArrayList<Usuario> usuarios;
    
    public Gerenciador(){
        usuarios = new ArrayList<>();
    }

    public String adicionar(String nome, String email){
        usuarios.add(new Usuario(nome, email));
        return "Cadastrado!";
    }

    public String listarUsuarios(){
        String ret="";

        for(Usuario u:usuarios){
            ret +="->"+u.getNome()+";"+u.getEmail()+"\n";
        }
        return ret;
    }

}
