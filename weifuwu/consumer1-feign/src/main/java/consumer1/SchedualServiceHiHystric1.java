package consumer1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SchedualServiceHiHystric1 implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}