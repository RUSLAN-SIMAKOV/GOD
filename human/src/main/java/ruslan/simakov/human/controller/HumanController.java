package ruslan.simakov.human.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruslan.simakov.human.model.HumanRequest;
import ruslan.simakov.human.service.HumanService;

@Slf4j
@RestController
@RequestMapping("api/v1/human")
public class HumanController {

    @Autowired
    private HumanService humanService;

    @PatchMapping()
    public ResponseEntity<?> createHuman(@RequestBody HumanRequest humanRequest) {
        log.info("Human {} creating", humanRequest.name());
        humanService.createHuman(humanRequest);
        return ResponseEntity.ok().build();
    }
}
