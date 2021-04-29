package is.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ConnectController {

     private final ConnectConfig config;

    public ConnectController(ConnectConfig config) {
        this.config = config;
    }


    @GetMapping("/")
    public String hello() {
        return config.toString();
    }
}
