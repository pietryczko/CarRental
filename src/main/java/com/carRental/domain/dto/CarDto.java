package com.carRental.domain.dto;

import com.carRental.domain.Rent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {
    private long id;
    private String licencePlateNumber;
    private String brand;
    private String model;
    private Rent rent;

}

