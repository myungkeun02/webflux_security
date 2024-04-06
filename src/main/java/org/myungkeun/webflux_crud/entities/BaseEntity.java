package org.myungkeun.webflux_crud.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class BaseEntity {
    @Id
    @Column("id")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column("createdAt")
    @CreatedDate
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column("updatedAt")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Column("createdBy")
    @CreatedBy
    private String createdBy;

    @Column("updatedBy")
    @LastModifiedBy
    private String updatedBy;

    @Column("isDeleted")
    private Boolean isDeleted;

    @Version
    private Integer version;
}
