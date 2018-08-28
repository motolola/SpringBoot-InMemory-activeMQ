package resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message)
    {
        return "Queue successfully created!";
    }

}
