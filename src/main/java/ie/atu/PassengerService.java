package ie.atu;

import ie.atu.Passenger;
import ie.atu.PassengerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo PassengerRepo;

    public List<Passenger> getPassenger()
    {
        return PassengerRepo.findAll();

    }

    public Passenger getPassenger(String PassengerID)
    {
        Passenger myPassenger = new Passenger("Ms", "Elise", "G003871700", "0830152926", 23);
        return myPassenger;
    }

    public void savePassenger(Passenger passenger)
    {
        PassengerRepo.save(passenger);

    }

    public Passenger findPassengerByName(String name){
        return PassengerRepo.findPassengerByName(name);
    }


    public void deletePassenger(Long count)
    {
        PassengerRepo.deleteById(count);
    }

    public List<Passenger> findPassengerByAgeRange(int age1, int age2)
    {
        return PassengerRepo.findPassengerByAge(age1, age2);
    }
}
