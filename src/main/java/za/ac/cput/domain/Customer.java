package za.ac.cput.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Game330 on 2016-05-30.
 */

@Entity
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private String phoneNumber;


    public Customer()
    {

    }

    private Customer(Builder build)
    {
        this.name = build.name;
        this.surname = build.surname;
        this.phoneNumber = build.phoneNumber;
        this.id = build.id;


    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{
        private long id;
        private String name;
        private String surname;
        private String phoneNumber;

        public Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder customer(Customer cust) {
            name = cust.getName();
            surname = cust.getSurname();
            phoneNumber = cust.getPhoneNumber();
            id = cust.getId();
            return this;
        }

        public Builder copy(Customer value){
            name = value.name;
            surname = value.surname;
            phoneNumber = value.phoneNumber;
            id = value.id;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }


    /*
    @Override
    public String toString()
    {
        return String.format("Id : %d\nName :%s\nSurname :%s\nAge :%s",id,name,surname,age);

    }

    */
}
