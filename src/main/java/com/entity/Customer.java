package com.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblcustomer")
public class Customer {
    @Id
    @Column(name = "Cus_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Cus_ID;
    @Column(name = "Cus_Name")
    private String Cus_Name;
    @Column(name = "Cus_Email")
    private String Cus_Email;
    @Column(name = "Cus_Phone")
    private String Cus_Phone ;
    @Column(name = "Cus_Address")
    private String Cus_Address;
}
