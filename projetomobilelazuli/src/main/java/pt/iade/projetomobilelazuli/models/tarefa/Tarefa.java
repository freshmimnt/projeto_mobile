package pt.iade.projetomobilelazuli.models.tarefa;

import jakarta.persistence.*;
import pt.iade.projetomobilelazuli.models.agenda.Agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarefa_id", nullable = false)
    private int id;

    @Column(name = "tarefa_name", nullable = false)
    private String name;

    @Column(name = "tarefa_data", nullable = false)
    private LocalDate date;

    @Column(name = "tarefa_hora", nullable = false)
    private LocalTime time;

    @Column(name = "tarefa_nota")
    private String nota;

    @Column(name = "tarefa_desc")
    private String desc;

    @Column(name = "is_finished", nullable = false)
    private boolean isFinished;

    @Column(name = "tarefa_agen_id", insertable=false, updatable=false)
    private int agendId;

    @ManyToOne
    @JoinColumn(name = "tarefa_agen_id", referencedColumnName = "agen_id")
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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
        this.agendId = agenda.getId();
    }
}
