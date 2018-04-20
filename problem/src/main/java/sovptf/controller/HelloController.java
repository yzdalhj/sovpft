package sovptf.controller;

import sovptf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/problem")
public class HelloController {

    @GetMapping("/search")
    public String index(Model  model)
    {
        return "search/entry";
    }
}
