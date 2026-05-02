package com.klef.fsad.exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klef.fsad.exam.demo.entity.Booking;
import com.klef.fsad.exam.demo.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    public Booking save(Booking b) {
        return repo.save(b);
    }

    public List<Booking> getAll() {
        return repo.findAll();
    }

    public Booking getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}