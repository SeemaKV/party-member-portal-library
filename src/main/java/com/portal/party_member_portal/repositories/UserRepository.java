package com.portal.party_member_portal.repositories;

/*import com.portal.party_member_portal.dto.MemberDto;*/
import com.portal.party_member_portal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/*import javax.websocket.server.PathParam;*/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByPhoneNumber(String phoneNumber);

    /*@Query(nativeQuery = true, value = "SELECT u.name, d.name, t.name, g.name, r.name\n" +
            "FROM user u\n" +
            "INNER JOIN district d ON u.district_id = d.id\n" +
            "INNER JOIN role r ON u.role_id = r.id\n" +
            "WHERE u.phone_number = 'phoneNumber';")
    public MemberDto findDistrictmemberDetails(@PathParam("phoneNumber") String phoneNumber);
    public User findBygramPanchayatId();
    public MemberDto findTalukmemberDetails(String phoneNumber);*/
}
