package com.devsuperior.dscatalog.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String authority;

    public Role() {
    }

    public Role(long id, String authority) {
        this.id = id;
        this.authority = authority;
    }
}
