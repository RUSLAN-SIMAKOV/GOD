package ruslan.simakov.human.service;

import org.springframework.stereotype.Service;
import ruslan.simakov.human.model.Human;
import ruslan.simakov.human.model.HumanRequest;

@Service
public class HumanServiceImpl implements HumanService{
    @Override
    public Human createHuman(HumanRequest humanRequest) {
        Human human = Human.of().name(humanRequest.name()).create();
        return human;
    }
}
