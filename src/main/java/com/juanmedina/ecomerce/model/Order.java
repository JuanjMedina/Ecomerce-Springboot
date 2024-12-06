package com.juanmedina.ecomerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private LocalDateTime fecha;
    private double total;
    private String state; //TODO: CAMBIAR A UN ENUM

    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

}
