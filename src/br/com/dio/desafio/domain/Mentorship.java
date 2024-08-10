package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentorship extends Conteudo{
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculeXp() {
        return XP_DEFALUT * 20;
    }

    @Override
    public String toString() {
      return "Mentorship{" +
          "title='" + getTitle() + '\'' +
          ", description='" + getDescription() + '\'' +
          ", date=" + date +
          '}';
    }


}
