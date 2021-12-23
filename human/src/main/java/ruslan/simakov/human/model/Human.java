package ruslan.simakov.human.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Data
@Builder(builderMethodName = "of", buildMethodName = "create")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Human {
    @Id
    @SequenceGenerator(name = "human_id_sequence", sequenceName = "human_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "human_id_sequence")
    private Integer id;
    private String name;
}
