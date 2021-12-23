package ruslan.simakov.human.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of", buildMethodName = "create")
public class Human {
    private Integer id;
    private String name;
}
