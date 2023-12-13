package com.easy.learn.controller;

import com.easy.learn.callApi.TrainerSalaryService;
import com.easy.learn.consts.UrlPath;
import com.easy.learn.dto.TrainerSalaryPaid.TrainerSalaryPaid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrainerSalaryPaidController {
    @Autowired
    TrainerSalaryService service;

    @GetMapping(UrlPath.GET_ALL_USER)
    public String getAllTrainerSalaryPaid(Model model) {
        List<TrainerSalaryPaid> salaryPaids = service.getAllTrainerSalaryPaid();

        model.addAttribute("salaryPaids", salaryPaids);

        return "pages/finance_management/salarypaids";
    }
}

