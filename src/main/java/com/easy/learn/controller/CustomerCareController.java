package com.easy.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer-care")
public class CustomerCareController {
    @GetMapping("")
    public String customerCareIndex(){
        return "pages/customerCare/index";
    }

    @GetMapping("/student")
    public String customerCareStudent(){
        return "pages/customerCare/customerCare_student";
    }

    @GetMapping("/trainer")
    public String customerCareTrainer(){
        return "pages/customerCare/customerCare_trainer";
    }

    @GetMapping("/table")
    public String customerCareTableIndex(){
        return "pages/customerCare/customerCare_table";
    }

    @GetMapping("/dashboard")
    public String customerCareDashboard(){
        return "pages/customerCare/customerCare_dashboard";
    }


}
