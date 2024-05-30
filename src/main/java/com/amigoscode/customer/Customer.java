package com.amigoscode.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @SequenceGenerator(sequenceName = "customer_generator", name = "customer_generator", allocationSize = 1)
    @GeneratedValue(generator = "customer_generator", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
