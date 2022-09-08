package VirtualStore.VSSprint3.Services;

import VirtualStore.VSSprint3.Model.Employee;

import java.util.List;

public interface IServiceEmployee {

    //Consultar todos los usuarios
    public List<Employee> getAll();

    //Crear un usuario
    public Employee Create(Employee employee);

    //Consultar un usuario por el id
    public Employee getbyId(Long id);

    //Eliminar un usuario por el id
    public void delete(Long id);


    //Actualizar un usuario por el id-falta
}
