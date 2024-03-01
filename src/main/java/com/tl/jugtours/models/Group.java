package com.tl.jugtours.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_group")
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    private String address;
    private String city;
    private String country;
    private String postalCode;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Event> events;
}
