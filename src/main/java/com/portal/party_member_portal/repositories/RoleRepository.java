package com.portal.party_member_portal.repositories;

import com.portal.party_member_portal.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
public Role findByName(String roleName);
}
