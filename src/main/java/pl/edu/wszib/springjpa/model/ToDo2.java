package pl.edu.wszib.springjpa.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class ToDo2 {

  @Id
  @GeneratedValue
  private Integer id;
@Column(name = "super_uber_zadanie", nullable = false)
  private String zadanie;
@Enumerated(EnumType.STRING)
  private ToDoStatus status;
@Temporal(TemporalType.TIMESTAMP)
private String mojaData;
  private Instant termin;
  @CreationTimestamp
  private Instant createdAt;
  @UpdateTimestamp
  private Instant updatedAt;

  @Transient
  private String nowaKolumna;

  public Integer getId() {
    return id;
  }

  public void setId(Integer integer) {
    this.id = integer;
  }

  public String getZadanie() {
    return zadanie;
  }

  public void setZadanie(String zadanie) {
    this.zadanie = zadanie;
  }

  public ToDoStatus getStatus() {
    return status;
  }

  public void setStatus(ToDoStatus status) {
    this.status = status;
  }

  public Instant getTermin() {
    return termin;
  }

  public void setTermin(Instant termin) {
    this.termin = termin;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
