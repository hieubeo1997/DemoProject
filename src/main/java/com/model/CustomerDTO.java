package com.model;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Integer cusid;
    private String  cusname;
    private String  cusphone;

    private String  cusaddress;

    private String  cusemail;

}
