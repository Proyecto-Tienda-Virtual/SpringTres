package VirtualStore.VSSprint3.Services;

import VirtualStore.VSSprint3.Model.Employee;
import VirtualStore.VSSprint3.Model.Enterprise;
import VirtualStore.VSSprint3.Repository.IRepositoryEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ImpleServiceEnterprise implements IServiceEnterprise{

    @Autowired
    IRepositoryEnterprise iRespositoryEnterprise;
    //Para mostrar todas las empresas
    @Override
    public List<Enterprise> getAll() {
        List<Enterprise>enterprises = new ArrayList<Enterprise>();
        enterprises.addAll(iRespositoryEnterprise.findAll());
        return enterprises;
    }
    //Para crear una empresa
    @Override
    public Enterprise Create(Enterprise enterprise) {
        return iRespositoryEnterprise.save(enterprise);
    }
    //Para consultar una empresa
    @Override
    public Enterprise getbyId(Long id) {
        Enterprise enterprise = iRespositoryEnterprise.findById(id).orElse(null);
        return enterprise;
    }
    //Para eliminar una empresa por id
    @Override
    public void delete(Long id) {
        iRespositoryEnterprise.deleteById(id);
    }
    //Para actualizar una empresa por ID
    @Override
    public Enterprise updateEnterprise(Enterprise enterprise) {
        return iRespositoryEnterprise.save(enterprise);
    }
}
