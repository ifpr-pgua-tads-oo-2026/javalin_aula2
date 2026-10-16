package br.edu.ifpr.pgua.eic.tads.controllers;

import br.edu.ifpr.pgua.eic.tads.models.Gerenciador;
import io.javalin.http.Context;

public class CadastroController {
    
    private Gerenciador gerenciador;

    public CadastroController(Gerenciador gerenciador){
        this.gerenciador = gerenciador;
    }

    public void get(Context ctx){
        ctx.render("cadastro.html");
    }

    public void post(Context ctx){
        String nome = ctx.formParam("nome");
        String email = ctx.formParam("email");

        String ret = gerenciador.adicionar(nome, email);

        ctx.result(gerenciador.listarUsuarios());
    }


}
