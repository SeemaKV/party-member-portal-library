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
public class GramPanchayat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "taluk_id")
    private Taluk taluk;
    @OneToMany(mappedBy = "gramPanchayat", cascade = CascadeType.ALL)
    private List<User> userList;
    @OneToOne(mappedBy = "gramPanchayat", cascade = CascadeType.ALL)
    private PollingStationDetail pollingStationDetail;
}
