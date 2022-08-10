package com.alnicode.working.days.control.backend.persistence.entity;

import com.alnicode.working.days.control.util.constants.UserConstants;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, length = UserConstants.NAME_LENGTH)
    private String name;

    @Column(nullable = false, length = UserConstants.LASTNAME_LENGTH)
    private String lastname;

    @Column(nullable = false, length = UserConstants.PHONE_LENGTH, unique = true)
    private String phone;

    @Column(nullable = false, length = UserConstants.EMAIL_LENGTH, unique = true)
    private String email;

    @Column(nullable = false, length = UserConstants.USERNAME_LENGTH, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
