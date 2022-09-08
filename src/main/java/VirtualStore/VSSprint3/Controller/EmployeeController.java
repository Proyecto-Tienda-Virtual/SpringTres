package VirtualStore.VSSprint3.Controller;

import VirtualStore.VSSprint3.Model.Employee;
import VirtualStore.VSSprint3.Services.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
