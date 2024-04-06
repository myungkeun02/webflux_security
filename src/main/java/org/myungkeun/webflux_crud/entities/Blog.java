package org.myungkeun.webflux_crud.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table("blog")


public class Blog extends BaseEntity{
    //Title
    @Column("title")
    private String title;
    //Category
    @Column("category")
    private String category;
    //Desc
    @Column("desc")
    private String desc;

}
