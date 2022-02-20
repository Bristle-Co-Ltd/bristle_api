package com.bristle.bristle_api.DataAccessLayer;
import com.bristle.bristle_api.Model.Ticket;
import com.bristle.bristle_api.Model.people_temp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<people_temp, Long> {

//    @Query("SELECT * FROM AndysTable")
//    Optional<people_temp> getAll();
}
