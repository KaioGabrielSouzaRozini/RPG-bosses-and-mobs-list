package RPG_bosses_and_mobs.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Mob implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private float altura;
    private String aparencia;
    private String poderes;
    @Column(nullable = false, updatable = false)
    private String mobCode;

    public Mob(float altura, String aparencia, String mobCode, Long id, String nome, String poderes) {
        this.altura = altura;
        this.aparencia = aparencia;
        this.mobCode = mobCode;
        this.id = id;
        this.nome = nome;
        this.poderes = poderes;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getAparencia() {
        return aparencia;
    }

    public void setAparencia(String aparencia) {
        this.aparencia = aparencia;
    }

    public String getMobCode() {
        return mobCode;
    }

    public void setMobCode(String bossCode) {
        this.mobCode = bossCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", altura='" + altura + '\'' +
                ", aparencia='" + aparencia + '\'' +
                ", poderes='" + poderes + '\'' +
                '}';
    }
}
