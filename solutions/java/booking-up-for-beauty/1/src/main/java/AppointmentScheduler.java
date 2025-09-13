import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.schedule() method");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.hasPassed() method");
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18; 
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "'You have an appointment on' EEEE, MMMM d, uuuu, 'at' h:mm a.",
            Locale.US
        );        
        return formatter.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        return LocalDate.of(year, 9, 15);
    }
}
