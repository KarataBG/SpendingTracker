package KarataBG.SpendingTracker.Pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String home() {
        return "login.html";
    }
}
