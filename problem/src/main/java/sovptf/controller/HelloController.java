package sovptf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/problem")
public class HelloController {

    /**
     * 首页模糊搜索
     */
    @GetMapping("/search")
    public String index(Model model)
    {
        return "search/entry";
    }
}
