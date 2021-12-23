package ruslan.simakov.death.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder(builderMethodName = "of", buildMethodName = "create")
public class DeathTimeResponse {
    private Instant time;
}
