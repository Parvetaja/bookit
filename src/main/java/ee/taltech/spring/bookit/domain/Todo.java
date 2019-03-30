package ee.taltech.spring.bookit.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private Long id;
    private String name;
    private String description;
    private Boolean done;

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + "\'}";
    }
}
