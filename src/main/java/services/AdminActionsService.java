package services;

//package com.laxman.simpli_fly.services;

import entities.AdminActions;
import java.util.List;

public interface AdminActionsService {
    AdminActions logAdminAction(AdminActions action);
    List<AdminActions> getActionsByAdminId(int adminId);
    List<AdminActions> getAllActions();
}

