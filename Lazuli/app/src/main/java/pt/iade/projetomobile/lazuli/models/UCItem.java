package pt.iade.projetomobile.lazuli.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class UCItem{

    private int id;
    private String nome;
    private String sala;
    private String prof;
    private String desc;

    public UCItem(){
        this(0, "","","","");
    }

    public UCItem(int id, String nome, String sala, String prof, String desc){
        this.id = id;
        this.nome = nome;
        this.sala = sala;
        this.prof = prof;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}