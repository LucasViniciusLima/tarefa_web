package br.edu.unipam.resource;

import java.util.List;

import javax.ws.rs.core.Response;

import br.edu.unipam.entity.Tarefa;
import br.edu.unipam.service.TarefaService;

public class TarefaResource {

    private TarefaService tarefaService;

    public Response listar (){
        List<Tarefa> tarefaList = tarefaService.listar();
        return Response.ok(tarefaList).build();
    }

    public Response listarPorUsuario (Long id){
        List<Tarefa> tarefaList = tarefaService.listarPorUsuario(id);
        return Response.ok(tarefaList).build();
    }
    
}
