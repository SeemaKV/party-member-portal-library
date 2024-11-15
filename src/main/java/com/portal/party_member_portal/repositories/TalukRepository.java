package com.portal.party_member_portal.repositories;

import com.portal.party_member_portal.entities.Taluk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalukRepository extends JpaRepository<Taluk, Integer> {
public Taluk findByName(String TalukName);
}
