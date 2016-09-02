package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Game330 on 2016-08-28.
 */

@Entity
public class Adoption implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String animalName;
    private  String customerName;
    private  String customerSurname;
    private String date;

    public long getId() {
        return id;
    }

    public String getAnimalName(){
        return animalName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerSurname(){
        return customerSurname;
    }
    public String getDate() {
        return date;
    }

    public Adoption()
    {

    }

    public Adoption(Builder builder) {
        id = builder.id;
        animalName = builder.animalName;
        customerName = builder.customerName;
        customerSurname = builder.customerSurname;
        date = builder.date;

    }
    public static class Builder {
        //Equivalent to setters
        private long id;
        private String animalName;
        private String customerName;
        private String customerSurname;
        private String date;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder animalName(String animalName) {
            this.animalName = animalName; //compulsary
            return this;
        }
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerSurname(String customerSurname) {
            this.customerSurname = customerSurname;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(Adoption adoption){
            this.id = adoption.getId();
            this.animalName = adoption.getAnimalName();
            this.customerName = adoption.getCustomerName();
            this.customerSurname = adoption.getCustomerSurname();
            this.date = adoption.date;

            return this;
        }
        public Adoption build() {
            return new Adoption(this);
        }
    }

    /*public String toString()
    {
        return String.format("Id : %d\ncustomerName :%s\nanimalName :%s\nPersalNumber :%s",id,name,surname,persalNumber);
    }*/


}
