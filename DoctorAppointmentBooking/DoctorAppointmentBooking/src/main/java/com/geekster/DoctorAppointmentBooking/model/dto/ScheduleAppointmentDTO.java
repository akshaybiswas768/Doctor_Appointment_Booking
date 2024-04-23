package com.geekster.DoctorAppointmentBooking.model.dto;

import com.geekster.DoctorAppointmentBooking.model.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleAppointmentDTO {

    AuthenticationInputDto authInfo;
    Appointment appointment;
}
