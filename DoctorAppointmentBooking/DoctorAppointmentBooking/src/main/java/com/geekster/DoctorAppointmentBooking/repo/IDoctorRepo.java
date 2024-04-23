package com.geekster.DoctorAppointmentBooking.repo;

import com.geekster.DoctorAppointmentBooking.model.Doctor;
import com.geekster.DoctorAppointmentBooking.model.Qualification;
import com.geekster.DoctorAppointmentBooking.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

    List<Doctor> findByDocQualificationOrDocSpecialization(Qualification qual, Specialization spec);
}
