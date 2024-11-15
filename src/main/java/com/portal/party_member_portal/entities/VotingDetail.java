package com.portal.party_member_portal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VotingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int year;
    private String partyName;
    private int total_votes_received;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
