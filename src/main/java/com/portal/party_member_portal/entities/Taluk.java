package com.portal.party_member_portal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taluk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "taluk", cascade = CascadeType.ALL)
    private List<User> user;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @OneToMany(mappedBy = "taluk", cascade = CascadeType.ALL)
    private List<GramPanchayat> gramPanchayatList;
    @OneToMany(mappedBy = "taluk", cascade = CascadeType.ALL)
    private List<PollingStationDetail> pollingStationDetailList;
}
