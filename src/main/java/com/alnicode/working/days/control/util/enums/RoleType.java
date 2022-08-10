package com.alnicode.working.days.control.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The role types.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum RoleType {
    USER(1, "USER"),
    ADMIN(2, "ADMIN");

    private final int id;
    private final String name;
}
