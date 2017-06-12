package byaj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PublicController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("message", "index");
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("message", "about");
        return "about";
    }

    @RequestMapping("/terms")
    public String terms(Model model){
        model.addAttribute("message", "terms");
        return "terms";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
