package br.com.dio.desafio.domain;

public class Course extends Conteudo{
    private int workload;

    public int getWorkload() {
        return workload;
    }
    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculeXp() {
        return XP_DEFALUT * workload;
    }

    @Override
    public String toString() {
      return "Course{" +
          "title='" + getTitle() + '\'' +
          ", description='" + getDescription() + '\'' +
          ", workload=" + workload +
          '}';
    }
   
}
