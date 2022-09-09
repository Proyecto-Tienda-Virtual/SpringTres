package VirtualStore.VSSprint3.Services;


import VirtualStore.VSSprint3.Model.Enterprise;

import java.util.List;

public interface IServiceEnterprise {

    //Consultar todas las empresas
    public List<Enterprise> getAll();

    //Crear una empresa
    public Enterprise Create(Enterprise enterprise);

    //Consultar una empresa por el id
    public Enterprise getbyId(Long id);

    //Eliminar una empresa
    public void delete(Long id);


    //Actualizar una empresa
    public Enterprise updateEnterprise(Enterprise enterprise);
}
