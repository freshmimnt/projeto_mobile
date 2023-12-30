package pt.iade.projetomobilelazuli.models.lembrete;


import jakarta.persistence.*;
import pt.iade.projetomobilelazuli.models.agenda.Agenda;

import java.time.*;

@Entity
@Table(name = "Lembrete")
public class Lembrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lemb_id", nullable = false)
    private int id;

    @Column(name = "lemb_name", nullable = false)
    private String name;

    @Column(name = "lemb_data")
    private LocalDate date;

    @Column(name = "lemb_hora")
    private LocalTime time;

    @Column(name = "lemb_desc")
    private String desc;

    @Column(name = "is_finished")
    private boolean isFinished;

    @Column(name = "lemb_agen_id", insertable=false, updatable=false)
    private int agendId;

    @ManyToOne
    @JoinColumn(name = "lemb_agen_id", referencedColumnName = "agen_id")
    private Agenda agenda;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public int getAgendId() {
        return agendId;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
        this.agendId = agendId;
    }
}
