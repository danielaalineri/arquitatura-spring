package io.github.danielaalineri.arquiteturaspring.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    public TodoEntity(){
   }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//deixa para o banco definir qual será a chave primária
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "fl_concluido")
    private Boolean concluido;


    public TodoEntity(Integer id, String descricao, Boolean concluido) {
        this.id = id;
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
