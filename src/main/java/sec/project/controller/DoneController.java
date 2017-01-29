package sec.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sec.project.repository.SignupRepository;

@Controller
@RequestMapping("/done")
public class DoneController {

    @Autowired
    private SignupRepository signupRepository;

    @RequestMapping(value = "/{id}")
    public String personalDetails(@PathVariable Long id, Model model) {
        model.addAttribute("signup", signupRepository.findOne(id));
        return "done";
    }
}