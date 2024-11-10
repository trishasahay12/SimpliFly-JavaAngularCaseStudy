package services;

//package com.laxman.simpli_fly.services;

import entities.Payments;

public interface PaymentsService {
    Payments processPayment(Payments payment);
    Payments getPaymentByBookingId(int bookingId);
    Payments refundPayment(int paymentId);
    boolean updatePaymentStatus(int paymentId, String status);
}

