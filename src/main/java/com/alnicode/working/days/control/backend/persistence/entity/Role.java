package com.alnicode.working.days.control.backend.persistence.entity;

import com.alnicode.working.days.control.util.constants.RoleConstants;
import com.alnicode.working.days.control.util.enums.RoleType;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The role model entity.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    private Integer id;

    @Column(nullable = false, length = RoleConstants.NAME_LENGTH)
    private String name;

    @ManyToMany(mappedBy = "roles", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<User> users = new HashSet<>();

    /**
     * Set a Role with a {@link RoleType} enum.
     *
     * @param roleType the enum to set.
     */
    public Role(final RoleType roleType) {
        this.id = roleType.getId();
        this.name = roleType.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
