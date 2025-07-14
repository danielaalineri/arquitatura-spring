package io.github.danielaalineri.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    //Esse metodo vai salvar no banco de dados

    boolean existsByDescricao(String descricao);
    //TodoEntity findBydescricao(String descricao);
}
