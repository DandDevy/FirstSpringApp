package danielandromain.bookingdemo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String hello(){
        return "<h1>hello</h1>";
    }
}
