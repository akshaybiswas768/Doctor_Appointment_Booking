package com.geekster.DoctorAppointmentBooking.repo;

import com.geekster.DoctorAppointmentBooking.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {

    Patient findFirstByPatientEmail(String newEmail);
}
