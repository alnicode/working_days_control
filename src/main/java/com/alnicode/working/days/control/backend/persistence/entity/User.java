package com.alnicode.working.days.control.backend.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The user model entity.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String lastname;

    private String phone;

    private String email;

    private String username;

    private String password;

}
