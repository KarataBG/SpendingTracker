package KarataBG.SpendingTracker.Pages;

import KarataBG.SpendingTracker.User;
import KarataBG.SpendingTracker.UserRepository;
import KarataBG.SpendingTracker.UserTDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Register {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registrationForm", new UserTDO());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(UserTDO form) {
        User user = new User();
        user.setUsername(form.getUsername());
        user.setPassword(form.getPassword());
        userRepository.save(user);
        return "/login";
    }
}
