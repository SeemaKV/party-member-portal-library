package com.portal.party_member_portal.repositories;

import com.portal.party_member_portal.entities.GramPanchayat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GramPanchayatRepository extends JpaRepository<GramPanchayat, Integer> {

    public GramPanchayat findByName(String GramPanchayatName);
}
