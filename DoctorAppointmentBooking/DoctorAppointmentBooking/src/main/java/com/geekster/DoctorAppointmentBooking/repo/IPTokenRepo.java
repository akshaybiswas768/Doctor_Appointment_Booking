package com.geekster.DoctorAppointmentBooking.repo;

import com.geekster.DoctorAppointmentBooking.model.PatientAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IPTokenRepo extends JpaRepository<PatientAuthenticationToken,Integer>{

    PatientAuthenticationToken findFirstByTokenValue(String tokenValue);
}
