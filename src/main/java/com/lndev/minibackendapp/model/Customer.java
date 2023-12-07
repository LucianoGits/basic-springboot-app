package com.lndev.minibackendapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_id_sequence",sequenceName =  "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private Integer id;
    private String username;
    private String email;
    private int age;
}
