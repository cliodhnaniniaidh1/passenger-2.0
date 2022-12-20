package ie.atu;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table

public class Passenger {

    private String title;
    private String name;
    private String iD;
    private String phone;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;

    public Passenger(String title, String name, String iD, String phone, int age){
        setTitle(title);
        setName(name);
        setiD(iD);
        setPhone(phone);
        setAge(age);
    }

    //returns title from Passenger method for user to input
    public String getTitle() {
        return title;
    }
    //returns name from passenger
    public String getName(){
        return name;
    }
    //returns ID from passenger
    public String getiD(){
        return iD;
    }
    //returns phone from passenger
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }

    public void setTitle(String title){
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Title Invalid. MUST be either Mr, Mrs or Ms");
        }
    }

    public void setName(String name){
        if(name.length()>=3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be a minimum of 3 characters");
        }
    }

    public void setiD(String iD){
        if(iD.length()>=10){
            this.iD=iD;
        }
        else{
            throw new IllegalArgumentException("ID MUST be a minimum of 10 characters");
        }
    }

    public void setPhone(String phone){
        if(phone.length()>=7){
            this.phone=phone;
        }
        else{
            throw new IllegalArgumentException("Phone number MUST be a minimum of 7 characters");
        }
    }

    public void setAge(int age){
        if(age>=16){
            this.age=age;
        }
        else{
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }
    }
}

