package services;

//package com.laxman.simpli_fly.services;

import entities.Admin;
import java.util.List;

public interface AdminActionsService {
    Admin logAdminAction(Admin action);
    List<Admin> getActionsByAdminId(int adminId);
    List<Admin> getAllActions();
}

