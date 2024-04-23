package com.geekster.DoctorAppointmentBooking.service;

import com.geekster.DoctorAppointmentBooking.model.Patient;
import com.geekster.DoctorAppointmentBooking.repo.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class PatientService {

    @Autowired
    IPatientRepo iPatientRepo;

    public String patientSingUp(Patient patient) {

        String newEmail = patient.getPatientEmail();

        Patient exestingPatient = iPatientRepo.findFirstByPatientEmail(newEmail);

        if (exestingPatient != null){
            return "email already exist, try singIn";
        }

        String singUpPassword = patient.getPatientPassword();


        try {
            String encryptedPassword = PasswordEncryptor.encrypt(singUpPassword);

            patient.setPatientPassword(encryptedPassword);

            iPatientRepo.save(patient);
            return "patient registered";

        } catch (NoSuchAlgorithmException e) {
            return "internal server issue try later";
        }
    }
}
