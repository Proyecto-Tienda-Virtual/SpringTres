package VirtualStore.VSSprint3.Services;

import VirtualStore.VSSprint3.Model.Employee;
import VirtualStore.VSSprint3.Repository.IRespositoryEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImpleServiceEmployee  implements IServiceEmployee {

    @Autowired
    IRespositoryEmployee iRespositoryEmployee;

    //Para mostrar todos los usuarios
    @Override
    public List<Employee> getAll() {

        List<Employee>employees = new ArrayList<Employee>();
        employees.addAll(iRespositoryEmployee.findAll());
        return employees;

    }

    //Para crear un usuario
    @Override
    public Employee Create(Employee employee) {

        return iRespositoryEmployee.save(employee);
    }

    //Para consultar un solo usuario
    @Override
    public Employee getbyId(Long id) {

        Employee employee = iRespositoryEmployee.findById(id).orElse(null);
        return employee;
    }


    //Para eliminar un usuario por el id
    @Override
    public void delete(Long id) {

        iRespositoryEmployee.deleteById(id);

    }
    //Para actualizar un usuario por el id
    @Override
    public Employee updateEmployee(Employee employee) {
        return iRespositoryEmployee.save(employee);
    }



}
