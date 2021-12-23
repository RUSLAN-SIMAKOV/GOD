package ruslan.simakov.human.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ruslan.simakov.human.model.DeathTimeResponse;
import ruslan.simakov.human.model.Human;
import ruslan.simakov.human.model.HumanRequest;
import ruslan.simakov.human.repository.HumanRepository;

@Service
public class HumanServiceImpl implements HumanService{

    @Autowired
    private HumanRepository humanRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Human createHuman(HumanRequest humanRequest) {
        Human human = Human.of().name(humanRequest.name()).create();

        DeathTimeResponse d = restTemplate.getForObject("http://localhost:7072/api/v1/{humanId}",
                DeathTimeResponse.class,
                human.getId());
        return humanRepository.save(human);
    }
}
