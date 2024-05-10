package com.example.dividend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

// DTO와 같은 역할
public class Company {

    private String ticker;
    private String name;

}
