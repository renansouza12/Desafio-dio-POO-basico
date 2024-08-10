package br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dataStart = LocalDate.now();
    private final LocalDate dataEnd = dataStart.plusDays(45);
    private Set<Dev> devsSubscribed = new HashSet<>();
    private Set<Conteudo> contents = new LinkedHashSet<>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Dev> getDevsSubscribed() {
        return devsSubscribed;
    }
    public void setDevsSubscribed(Set<Dev> devsSubscribed) {
        this.devsSubscribed = devsSubscribed;
    }
    public Set<Conteudo> getContents() {
        return contents;
    }
    public void setContents(Set<Conteudo> contents) {
        this.contents = contents;
    }
}
