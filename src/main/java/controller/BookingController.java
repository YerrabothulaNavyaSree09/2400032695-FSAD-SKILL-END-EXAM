package com.klef.fsad.exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klef.fsad.exam.demo.entity.Booking;
import com.klef.fsad.exam.demo.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "*") // optional but avoids frontend issues
public class BookingController {

    @Autowired
    private BookingService service;

    // TEST ENDPOINT (to verify controller is working)
    @GetMapping("/test")
    public String test() {
        return "Booking API Working";
    }

    // CREATE
    @PostMapping
    public Booking create(@RequestBody Booking b) {
        return service.save(b);
    }

    // READ ALL
    @GetMapping
    public List<Booking> getAll() {
        return service.getAll();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Booking getOne(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}