package VirtualStore.VSSprint3.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")

public class Transaction {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String concept;
    @Column
    private float amount;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Employee users;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    @Column
    private Date createdAt;

    @Column
    private Date updateAt;

    public Transaction() {
    }

    public Transaction(Long id, String concept, float amount, Employee users, Enterprise enterprise, Date createdAt, Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.users = users;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee getUsers() {
        return users;
    }

    public void setUsers(Employee users) {
        this.users = users;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
