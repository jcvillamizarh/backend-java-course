package com.jcvh.domain;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {

    private int id;
    private Doctor doctor;
    private Patient patient;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.doctor = doctor;
        this.patient = patient;
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
