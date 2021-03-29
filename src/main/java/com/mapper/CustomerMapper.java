package com.mapper;

import com.entity.Customer;
import com.model.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class CustomerMapper {
    public static CustomerDTO toCustomerDTO(Customer cus){
        CustomerDTO temp = new CustomerDTO();
        temp.setCusid(cus.getCus_ID());
        temp.setCusname(cus.getCus_Name());
        temp.setCusphone(cus.getCus_Phone());
        temp.setCusaddress(cus.getCus_Address());
        temp.setCusemail(cus.getCus_Email());
        return temp;
    }
}
