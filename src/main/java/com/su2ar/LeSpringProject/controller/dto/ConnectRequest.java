package com.su2ar.LeSpringProject.controller.dto;

import com.su2ar.LeSpringProject.model.User;

import lombok.Data;

@Data
public class ConnectRequest {
    private User user;
    private String gameId;
    
}