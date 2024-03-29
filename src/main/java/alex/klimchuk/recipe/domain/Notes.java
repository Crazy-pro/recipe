package alex.klimchuk.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Copyright Alex Klimchuk (c) 2022.
 */
@Data
@Entity
@Builder
@EqualsAndHashCode(exclude = {"recipe"})
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Recipe recipe;

    @Lob
    @Column(name = "recipe_notes")
    private String recipeNotes;

}
