package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodCategory extends Category{
    private String expirationDate;
    private String ingredients;
    private int calories;
    @Override
    public void printDetails() {
        System.out.println("This is food category class");
    }
}
