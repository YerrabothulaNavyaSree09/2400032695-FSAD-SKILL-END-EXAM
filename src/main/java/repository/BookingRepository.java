package com.klef.fsad.exam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.demo.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}