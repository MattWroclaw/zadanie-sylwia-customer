package mateuszek.zadaniesylwiacustomer.controller;

import lombok.RequiredArgsConstructor;
import mateuszek.zadaniesylwiacustomer.entity.Customer;
import mateuszek.zadaniesylwiacustomer.entity.Testowanie;
import mateuszek.zadaniesylwiacustomer.repository.CustomerRepository;
import mateuszek.zadaniesylwiacustomer.repository.TestowanieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/customer")
public class CustomerControllser {

    private final TestowanieRepository testowanieRepository;
    private final CustomerRepository customerRepository;

    @GetMapping("/alltests")
    public List<Testowanie> allTests(){
        return testowanieRepository.findAll();
    }

    @PostMapping(value = "/addtest")
    private void addTestowanie(@RequestBody final Testowanie testowanie) {
        testowanieRepository.save(testowanie);
        System.out.println("zadziałało przyjął obiekt");
    }

    @PostMapping(value = "/addcustomer")
    private void addCustomer(@RequestBody final Customer customer) {
        customerRepository.save(customer);
    }
}
