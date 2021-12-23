package ruslan.simakov.human.service;

import ruslan.simakov.human.model.Human;
import ruslan.simakov.human.model.HumanRequest;

public interface HumanService {

    Human createHuman(HumanRequest humanRequest);
}
