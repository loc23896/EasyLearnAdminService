package com.easy.learn.controller;

import com.easy.learn.callApi.TrainerSalaryPaidSummaryService;
import com.easy.learn.dto.TrainerSalaryPaidSummary.TrainerSalaryPaidSummary;
import com.easy.learn.dto.TrainerSalaryPaidSummary.TrainerSalaryPaidSummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/trainersalary")
public class TrainerSalaryPaidSummaryController {

    @Autowired
    private TrainerSalaryPaidSummaryService trainerSalaryPaidSummaryService;

    @GetMapping("/list")
    public String getAllTrainerSalaryPaid(Model model) {
        model.addAttribute("trainerSalaryPaidList", trainerSalaryPaidSummaryService.getAllTrainerSalaryPaid());
        model.addAttribute("trainerSalaryPaidDTO", new TrainerSalaryPaidSummaryDTO()); // For form binding
        return "/pages/finance_management/list";
    }

    @PostMapping("/save")
    public String saveTrainerSalaryPaid(@ModelAttribute("trainerSalaryPaidDTO") TrainerSalaryPaidSummaryDTO trainerSalaryPaidDTO ) {
        if (trainerSalaryPaidDTO.getId() == null) {

            trainerSalaryPaidSummaryService.createTrainerSalaryPaid(trainerSalaryPaidDTO);
        } else {

            trainerSalaryPaidSummaryService.updateTrainerSalaryPaid(trainerSalaryPaidDTO);

        }
        return "redirect:/trainersalary/list";
    }

    @GetMapping("/view/{id}")
    public String viewTrainerSalaryPaid(@PathVariable Long id, Model model) {
        TrainerSalaryPaidSummary trainerSalaryPaid = trainerSalaryPaidSummaryService.getTrainerSalaryPaidById(id);
        model.addAttribute("trainerSalaryPaidDTO", trainerSalaryPaid);
        return "/pages/finance_management/view";
    }

    @GetMapping("/edit/{id}")
    public String editTrainerSalaryPaid(@PathVariable Long id, Model model) {
        TrainerSalaryPaidSummary trainerSalaryPaid = trainerSalaryPaidSummaryService.getTrainerSalaryPaidById(id);
        model.addAttribute("trainerSalaryPaidDTO", trainerSalaryPaid);
        List<TrainerSalaryPaidSummary> trainerSalaryPaidList = trainerSalaryPaidSummaryService.getAllTrainerSalaryPaid();
        model.addAttribute("trainerSalaryPaidList", trainerSalaryPaidList);
        return "/pages/finance_management/edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrainerSalaryPaid(@PathVariable Long id) {
        trainerSalaryPaidSummaryService.deleteTrainerSalaryPaid(id);
        return "redirect:/trainersalary/list";
    }

    @GetMapping("/hi")
    public String testHi (){
        return "abc";
    }

}
