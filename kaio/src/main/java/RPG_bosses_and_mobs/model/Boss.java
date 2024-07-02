package RPG_bosses_and_mobs.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Boss implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private float altura;
    private String aparencia;
    private String poderes;
    private String descricao;
    @Column(nullable = false, updatable = false)
    private String bossCode;

    public void setBossCode(String bossCode) {
        this.bossCode = bossCode;
    }

    public Boss(float altura, String aparencia, String bossCode, String descricao, Long id, Integer idade, String nome, String poderes) {
        this.altura = altura;
        this.aparencia = aparencia;
        this.bossCode = bossCode;
        this.descricao = descricao;
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.poderes = poderes;
    }

    public String getBossCode() {
        return bossCode;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public String getAparencia() {
        return aparencia;
    }

    public void setAparencia(String aparencia) {
        this.aparencia = aparencia;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", altura='" + altura + '\'' +
                ", aparencia='" + aparencia + '\'' +
                ", poderes='" + poderes + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

}
