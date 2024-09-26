package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarCategory extends Category{
    private String color;
    private double weight;
    private String tireType;
    private String manufacturingPlace;
    @Override
    public void printDetails() {
        System.out.println("This is car category class");
    }
}
