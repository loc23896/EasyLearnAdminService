package com.easy.learn.dto.TrainerSalaryPaid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerSalaryPaid implements Serializable {
    private Long id;
    private String trainerSalaryPaidId;
    private Integer weekNumber;
    private Integer monthNumber;
    private Integer yearNumber;
    private Double totalNumber;
}
