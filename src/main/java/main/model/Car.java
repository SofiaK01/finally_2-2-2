package main.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Column(name = "model")
    String model;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer series;
    @Column(name = "if_new")
    String ifNew;

    public Car() {

    }

    public Car(String model, int series, String ifNew) {
        this.model = model;
        this.series = series;
        this.ifNew = ifNew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String isIfNew() {
        return ifNew;
    }

    public void setIfNew(String ifNew) {
        this.ifNew = ifNew;
    }

    @Override
    public String toString() {
        return "Car {" +
                "main.model  = '" + model + '\'' +
                ", series = '" + series + '\'' +
                ", is from salon = " + ifNew +
                '}';
    }
}
