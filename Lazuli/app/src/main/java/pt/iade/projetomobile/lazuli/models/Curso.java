package pt.iade.projetomobile.lazuli.models;

public class Curso {

    private int id;

    private String name;

    public Curso(){

    }

    public Curso(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}