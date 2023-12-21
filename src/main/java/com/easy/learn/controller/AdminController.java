package com.easy.learn.controller;

import com.easy.learn.callApi.ManagerService;
import com.easy.learn.dto.Manager.ManagerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController {
    @GetMapping("/admin")
    public String index (){
        System.out.println("access");
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
}
