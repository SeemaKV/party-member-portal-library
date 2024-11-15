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
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL/*, fetch = FetchType.LAZY*/)
    private List<User> userList;
    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL/*, fetch = FetchType.LAZY*/)
    private List<Taluk> talukList;
    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL/*, fetch = FetchType.LAZY*/ )
    private List<PollingStationDetail> pollingStationDetailList;
}
