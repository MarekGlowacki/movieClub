package online.javafun.movieclub.web;

import online.javafun.movieclub.domain.user.UserService;
import online.javafun.movieclub.domain.user.dto.UserRegistrationDto;
import online.javafun.movieclub.web.admin.AdminController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {
    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registrationForm(Model model) {
        UserRegistrationDto userRegistration = new UserRegistrationDto();
        model.addAttribute("user", userRegistration);
        return "registration-form";
    }

    @PostMapping("/registration")
    public String register(UserRegistrationDto userRegistration, RedirectAttributes redirectAttributes) {
        userService.registerUserWithDefaultRole(userRegistration);
        redirectAttributes.addFlashAttribute(
                AdminController.NOTIFICATION_ATTRIBUTE,
                "Username %s saved".formatted(userRegistration.getEmail()));
        return "redirect:/";
    }
}