
package com.example.trainbookingsystem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.trainbookingsystem.entity.Ticket;
import com.example.trainbookingsystem.entity.Train;
import com.example.trainbookingsystem.entity.User;
import com.example.trainbookingsystem.repository.TicketRepository;
import com.example.trainbookingsystem.repository.TrainRepository;
import com.example.trainbookingsystem.repository.UserRepository;
import com.example.trainbookingsystem.service.TicketService;
import com.example.trainbookingsystem.service.TrainService;
import com.example.trainbookingsystem.service.UserService;

@ExtendWith(MockitoExtension.class)
public class TicketServiceTest {

    @Mock
    private TicketRepository ticketRepository;
    @Mock
    private UserRepository userRepository;
    @Mock  private TrainRepository trainRepository;

    @InjectMocks
    private TicketService ticketService;
    @InjectMocks
    private TrainService trainService;
    @InjectMocks
    private UserService UserService;

    private Ticket ticket;
    private Train train;
    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
    }
    @BeforeEach
        void setup(){
        train = new Train();
        train.setId(1L);
        train.setName("chennai express");
        train.setSource("coimbatore");
        train.setDestination("chennai");
        train.setBasePrice(1000);
        train.setDiscountPercentage(5.0);
    }

    @BeforeEach{}
        ticket = new Ticket();
        ticket.setId(1L);
        ticket.setUser("Madhanika");
        ticket.setTrain("banglore express");
        ticket.setfinalPrice("chennai");

    }
