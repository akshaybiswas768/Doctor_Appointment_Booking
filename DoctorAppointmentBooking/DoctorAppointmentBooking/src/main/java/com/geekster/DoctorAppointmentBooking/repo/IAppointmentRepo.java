package com.geekster.DoctorAppointmentBooking.repo;

import com.geekster.DoctorAppointmentBooking.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Integer> {
}
