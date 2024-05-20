package kg.iman.server.client.config.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Value("${message}")
    private String exampleProperty;

    @GetMapping
    public String getExampleProperty() {
        return "sfdsdf";
    }
}
