package ruslan.simakov.death.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruslan.simakov.death.model.DeathTimeResponse;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/death")
public class DeathController {

    @GetMapping("humanId")
    public ResponseEntity<DeathTimeResponse> timeOfDeath(@PathVariable Integer humanId) {
        return ResponseEntity.ok(DeathTimeResponse.of()
                .time(Instant.now().plusSeconds(TimeUnit.DAYS.toSeconds(humanId * 10000)))
                .create());
    }
}
