package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> contents = new LinkedHashSet<>();
    private Set<Conteudo> contentsDone = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getContents() {
        return contents;
    }

    public void setContents(Set<Conteudo> contents) {
        this.contents = contents;
    }

    public Set<Conteudo> getContentsDone() {
        return contentsDone;
    }

    public void setContentsDone(Set<Conteudo> contentsDone) {
        this.contentsDone = contentsDone;
    }

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.contents.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    public void progress() {
     Optional<Conteudo> content =   this.contents.stream().findFirst();
     if(content.isPresent()){
        this.contentsDone.add(content.get());
        this.contents.remove(content.get());
     }else{
        System.out.println("You aren't not subscribe in any content");
     }
    }

    public double calculeXp() {
       return this.contentsDone.stream().mapToDouble(contents -> contents.calculeXp()).sum();
    }


}
