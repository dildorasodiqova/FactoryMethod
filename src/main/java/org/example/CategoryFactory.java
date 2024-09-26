package org.example;

public class CategoryFactory {

    public static Category createCategory(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new CarCategory("Red", 1500.5, "Winter", "Germany");
            case "food" -> new FoodCategory("2025-12-31", "Wheat, Sugar", 250);
            default -> new CarCategory();
        };
    }
}
