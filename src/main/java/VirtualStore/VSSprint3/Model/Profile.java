package VirtualStore.VSSprint3.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profile")

public class Profile {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Employee user;

    @Column
    private Date createdAt;

    @Column
    private Date updateAt;

    //Constructor vacio
    public Profile() {
    }

    //Constructor con atributos
    public Profile(Long id, String email, Employee user, Date createdAt, Date updateAt) {
        this.id = id;
        this.email = email;
        this.user = user;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
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
