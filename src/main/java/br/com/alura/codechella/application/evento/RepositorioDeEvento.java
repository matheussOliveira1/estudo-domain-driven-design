package br.com.alura.codechella.application.evento;

import br.com.alura.codechella.domain.evento.Evento;

public interface RepositorioDeEvento {

    Evento buscarEventoPorCidade(String cep);

}
