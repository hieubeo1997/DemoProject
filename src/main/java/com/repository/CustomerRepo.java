package com.repository;

import com.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "Select * From tblcustomer c LIMIT ?1, ?2",nativeQuery =  true)
    public List<Customer> GetCustomersWithPages(Integer at, Integer total);
    @Query(value = "select * from tblcustomer c WHERE c.Cus_Name LIKE %?%", nativeQuery = true)
    public List<Customer> FindCustomerByName(String name);
    @Query(value ="select * from tblcustomer c WHERE  c.Cus_Email = %?%", nativeQuery = true)
    public Customer FindCustomerByEmail(@Param("email") String email);
    @Query(value ="select * from tblcustomer c WHERE  c.Cus_Phone = ?", nativeQuery = true)
    public Customer FindCustomerByPhone(@PathVariable("phone") String phone);
    @Modifying
    @Transactional
    @Query(value = "UPDATE  tblcustomer ", nativeQuery = true)
    public void Update(String name, String avatar, String phone, String address);
}
