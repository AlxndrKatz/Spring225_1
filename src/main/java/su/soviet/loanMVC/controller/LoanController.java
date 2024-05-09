package su.soviet.loanMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import su.soviet.loanMVC.service.LoanService;

@Controller
public class LoanController {

    private final LoanService service;

    @Autowired
    public LoanController(LoanService service) {
        this.service = service;
    }

    @GetMapping("/loan")
    public String getLoanByUserId(@RequestParam(value = "userId") Long userId,
                                  Model model) {
        model.addAttribute("loan", service.assessLoan(userId));
        return "loan";
    }
}