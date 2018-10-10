package intersorg.task.controller;

import intersorg.task.model.LoansDataEntity;
import intersorg.task.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class LoansController {

    @Autowired
    UserRepo userRepo;


    @RequestMapping(value = "/file")
    public List<LoansDataEntity> findAll(){
        return userRepo.findAll();
    }

    @GetMapping(value = "/file/city/{city}")
    public List<LoansDataEntity> findAll(
            @PathVariable("city") String city){
        return userRepo.find(city);
    }
    @GetMapping(value = "/file/gender/{gender}")
    public List<LoansDataEntity> findByGender(@PathVariable("gender") int gender){
        return userRepo.findByGender(gender);
    }

    @GetMapping(value = "/file/gender/{gender}/city/{city}/status/{status}")
    public List<LoansDataEntity> findAll(
            @PathVariable("gender") int gender,
            @PathVariable("city") String city,
            @PathVariable("status") String status){
        List<LoansDataEntity> data = userRepo.findToParam(gender, city, status);
        return data;
    }
}
