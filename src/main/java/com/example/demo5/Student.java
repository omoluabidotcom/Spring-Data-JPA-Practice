package com.example.demo5;

import javax.persistence.*;

@Entity(name = "student")
@Table(
        name = "student",
        uniqueConstraints = {@UniqueConstraint( name = "student_email_unique", columnNames = "email")}
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName="student_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    Long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String firstname;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String lastname;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String email;

    @Column(
            name = "age",
            nullable = false
    )
    int age;

    public Student() {

    }

    public Student(String fname, String lname, String mail, int old, String location) {

        this.firstname=fname;
        this.lastname=lname;
        this.age=old;
        this.email=mail;
    }


}
