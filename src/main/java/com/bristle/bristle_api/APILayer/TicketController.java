package com.bristle.bristle_api.APILayer;

import com.bristle.bristle_api.BristleApiApplication;
import com.bristle.bristle_api.Model.people_temp;
import com.bristle.bristle_api.ServiceLayer.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    private TicketController(TicketService injectedTicketService){
        this.ticketService = injectedTicketService;
    }

    @GetMapping("/getAll")
    public String getAll(){
        return ticketService.getAll().toString();
    }

    @GetMapping("/test")
    public String test(){
        return "eee";
    }
}
