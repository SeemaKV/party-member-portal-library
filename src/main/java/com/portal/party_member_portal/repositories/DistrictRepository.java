package com.portal.party_member_portal.repositories;

import com.portal.party_member_portal.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
    public District findByName(String districtName);

}
