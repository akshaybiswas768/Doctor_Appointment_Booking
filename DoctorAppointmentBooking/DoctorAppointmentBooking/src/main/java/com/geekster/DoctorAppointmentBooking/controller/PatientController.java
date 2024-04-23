package com.geekster.DoctorAppointmentBooking.controller;


import com.geekster.DoctorAppointmentBooking.model.Patient;
import com.geekster.DoctorAppointmentBooking.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping()
    public String patientSingUp(@Valid @RequestBody Patient patient){
        return patientService.patientSingUp(patient);
    }
}
