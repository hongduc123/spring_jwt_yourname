package com.example.spring_boot_jwt_yourname.enity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "t_token")
class Token extends BaseEntity {
    @Column(length = 1000)
    private String token;
    private Date tokenExpDate;
}
