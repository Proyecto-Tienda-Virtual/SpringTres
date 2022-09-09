package VirtualStore.VSSprint3.Controller;


import VirtualStore.VSSprint3.Model.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
@RestController
@RequestMapping
public class EnterpriseController {

    @Autowired
    VirtualStore.VSSprint3.Services.IServiceEnterprise IServiceEnterprise;

    //GET
    @GetMapping("/enterprises")
    public List<Enterprise> getAll(){
        return IServiceEnterprise.getAll();

    }

    //POST
    @PostMapping("/enterprises")
    public Enterprise Create(@RequestBody Enterprise enterprise){
        return IServiceEnterprise.Create(enterprise);

    }

    //GET
    @GetMapping("/enterprise/{id}")
    public Enterprise getbyId(@PathVariable("id") Long id){
        return IServiceEnterprise.getbyId(id);
    }

    //DELETE
    @DeleteMapping("/enterprise/{id}")
    public void delete(@PathVariable ("id") Long id){
        IServiceEnterprise.delete(id);

    }

    //PATCH
    @PatchMapping("/enterprise/{id}")
    public Enterprise updateEnterprise (@PathVariable Long id, @RequestBody Enterprise enterprise){
        Enterprise enterprise1 = IServiceEnterprise.getbyId(id);

        enterprise1.setName(enterprise.getName());
        enterprise1.setDocument(enterprise.getDocument());
        enterprise1.setPhone(enterprise.getPhone());
        enterprise1.setAddress(enterprise.getAddress());
        enterprise1.setCreatedAt(enterprise.getCreatedAt());
        enterprise1.setUpdateAt(enterprise.getUpdateAt());

        IServiceEnterprise.updateEnterprise(enterprise1);

        return enterprise1;
    }
}
