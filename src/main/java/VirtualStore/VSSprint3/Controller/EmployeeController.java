package VirtualStore.VSSprint3.Controller;

import VirtualStore.VSSprint3.Model.Employee;
import VirtualStore.VSSprint3.Services.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    IServiceEmployee iServiceEmployee;

    //GET
    @GetMapping("/users")
    public List<Employee> getAll(){
        return iServiceEmployee.getAll();

    }

    //POST
    @PostMapping("/users")
    public Employee Create(@RequestBody Employee employee){
        return iServiceEmployee.Create(employee);

    }

    //GET
    @GetMapping("/user/{id}")
    public Employee getbyId(@PathVariable("id") Long id){
        return iServiceEmployee.getbyId(id);
    }

    //DELETE
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable ("id") Long id){
        iServiceEmployee.delete(id);

    }

    //PATCH
    @PatchMapping("/user/{id}")
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee){
        Employee employee1 = iServiceEmployee.getbyId(id);

        employee1.setEmail(employee.getEmail());
        employee1.setRole(employee.getRole());
        employee1.setEnterprise(employee.getEnterprise());
        employee1.setCreatedAt(employee.getCreatedAt());
        employee1.setUpdateAt(employee.getUpdateAt());

        iServiceEmployee.updateEmployee(employee1);

        return employee1;
    }
}
