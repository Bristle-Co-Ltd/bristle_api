package com.bristle.bristle_api.ServiceLayer;

import com.bristle.bristle_api.DataAccessLayer.TicketRepository;
import com.bristle.bristle_api.Model.people_temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepo;

    @Autowired
    public TicketService(TicketRepository injectedTicketRepo){
        this.ticketRepo = injectedTicketRepo;
    }

    public List<people_temp> getAll(){
        return ticketRepo.findAll();
    }
}
