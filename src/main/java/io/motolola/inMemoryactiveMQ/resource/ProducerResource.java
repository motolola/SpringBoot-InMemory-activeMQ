package io.motolola.inMemoryactiveMQ.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;


    @RequestMapping("{message}")
    public String publish(@PathVariable("message") final String message)
    {
        jmsTemplate.convertAndSend(queue, message);
        return "Queue successfully created!";
    }

    @RequestMapping("boy")
    public String boy()
    {
        return "boy";
    }

}
