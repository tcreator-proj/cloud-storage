package ru.tcreator.cloudstorage.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "authorize")
public class UserAuth {
    @Id
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
