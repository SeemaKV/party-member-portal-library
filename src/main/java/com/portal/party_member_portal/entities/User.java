package com.portal.party_member_portal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "aadhar_number")
    private String aadharNumber;
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;
    @Column(unique = true)
    private String password;
    @Column(name = "party_name")
    private String partyName;
    private String gender;
    @Column(name = "data_of_birth")
    private String dateOfBirth;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "is_active")
    private String isActive;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "taluk_id")
    private Taluk taluk;
    @OneToOne
    @JoinColumn(name = "gramPanchayat_id")
    private GramPanchayat gramPanchayat;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private VotingDetail votingDetail;

}
