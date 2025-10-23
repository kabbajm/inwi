package ma.inwi.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Coucou {
    @GetMapping("/")
    public String coucou() {
        return "coucou";
    }
}
