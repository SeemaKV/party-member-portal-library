package com.portal.party_member_portal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollingStationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int maleVoters;
    private int femaleVoters;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "taluk_id")
    private Taluk taluk;
    @OneToOne
    @JoinColumn(name = "gramPanchayat_id")
    private GramPanchayat gramPanchayat;

}
