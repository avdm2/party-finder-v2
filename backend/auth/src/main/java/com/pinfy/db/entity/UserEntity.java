package com.pinfy.db.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("auth.users")
public class UserEntity {

    @Id
    private Long id;

    private String username;
}
