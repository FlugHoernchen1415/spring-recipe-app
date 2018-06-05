package reichhorn.spring.recipeapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
}
