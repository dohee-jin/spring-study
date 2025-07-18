package com.spring.core.chap02_4.model;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String studentId;
    private String name;
    private String grade;

}
