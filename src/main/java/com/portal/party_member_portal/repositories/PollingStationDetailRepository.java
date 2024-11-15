package com.portal.party_member_portal.repositories;

import com.portal.party_member_portal.entities.PollingStationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollingStationDetailRepository extends JpaRepository<PollingStationDetail, Integer> {

}
