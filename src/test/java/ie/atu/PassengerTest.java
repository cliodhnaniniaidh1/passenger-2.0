package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {
    //Write tests first for each variable
    //No need for Passenger myPassenger line as an object is being created inside each success test
    @BeforeEach
    void setUp(){
    }

    //Test if Passenger title is equal to either Mr, Mrs or Ms and matches the expected title within the test
    @Test
    void testPassengerTitleMrSuccess(){
        Passenger newPassenger = new Passenger("Mr","Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("Mr", newPassenger.getTitle());
    }
    @Test
    void testPassengerTitleMrsSuccess(){
        Passenger newPassenger = new Passenger("Mrs","Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("Mrs", newPassenger.getTitle());
    }
    @Test
    void testPassengerTitleMsSuccess(){
        Passenger newPassenger = new Passenger("Ms","Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("Ms", newPassenger.getTitle());
    }

    //Test if Passenger title does not equal Mr, Mrs or Ms and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister","Cliodhna", "G0038639500", "0873883598", 22);});
        assertEquals("Title Invalid. MUST be either Mr, Mrs or Ms", exMessage.getMessage());
    }

    //Test if Passenger name is at least 3 characters and matches the expected name within the test
    @Test
    void testPassengerNameSuccess(){
        Passenger newPassenger = new Passenger("Ms","Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("Cliodhna", newPassenger.getName());
    }

    //Test if Passenger name is under 3 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mrs","el", "G0038639500", "0873883598", 22);});
        assertEquals("Name must be a minimum of 3 characters", exMessage.getMessage());
    }

    //Test if Passenger ID is at least 10 characters and matches the expected ID within the test
    @Test
    void testPassengerIdSuccess(){
        Passenger newPassenger = new Passenger("Ms", "Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("G0038639500", newPassenger.getiD());
    }

    //Test if Passenger ID is under 10 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Ms", "Cliodhna", "G00", "0873883598", 22);});
        assertEquals("ID MUST be a minimum of 10 characters", exMessage.getMessage());
    }

    //Test if Passenger phone number is at least 7 characters and matches the expected number within the test
    @Test
    void testPassengerPhoneSuccess(){
        Passenger newPassenger = new Passenger("Ms", "Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals("0873883598", newPassenger.getPhone());
    }

    //Test if Passenger phone number is under 7 characters and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Ms", "Cliodhna", "G0038639500", "000", 22);});
        assertEquals("Phone number MUST be a minimum of 7 characters", exMessage.getMessage());
    }

    //Test if Passenger age is over 16 and matches the expected age within the test
    @Test
    void testPassengerAgeSuccess(){
        Passenger newPassenger = new Passenger("Ms", "Cliodhna", "G0038639500", "0873883598", 22);
        assertEquals(22, newPassenger.getAge());
    }

    //Test if Passenger is under 16 and will look for Illegal Argument Exception within Passenger class
    @Test
    void testPassengerAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Ms", "Cliodhna", "G0038639500", "0873883598", 10);});
        assertEquals("Passenger is too young to fly. MUST be over 16", exMessage.getMessage());
    }

    //Clear previous object of data before starting again
    @AfterEach
    void tearDown(){

    }

}
