package br.com.dio.desafio.domain;

public abstract class Conteudo {
    protected static final double XP_DEFALUT = 10;

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculeXp();
}
