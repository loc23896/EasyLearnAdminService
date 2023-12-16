package com.easy.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {
    @GetMapping("/admin")
    public String index (){
        return "pages/admin/index";
    }

    @GetMapping("/admin/finance")
    public String adminFinance(){
        return "pages/admin/admin_finance";
    }

    @GetMapping("/admin/customer-care")
    public String adminCustomerCare(){
        return "pages/admin/admin_customerCare";
    }

    @GetMapping("/admin/members")
    public String adminMembers(){
        return "pages/admin/admin_members";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard(){
        return "pages/admin/admin_dashboard";
    }

    @GetMapping("/login")
    public String login(){
        return "pages/loginPage/login";
    }

    @GetMapping("/register")
    public String register(){
        return "pages/loginPage/register";
    }

    @GetMapping("/table")
    public String table(){
        return "pages/admin/admin_table";
    }

    @GetMapping("/profile")
    public String profile(){
        return "pages/admin/admin_profile";
    }

    @GetMapping("/profile/edit")
    public String changeProfile(){
        return "pages/admin/admin_profile_edit";
    }
}
