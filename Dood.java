package models;

public class Dood { 
    private String name;
    private double fee;
    private int quantity;
    private String color;
    private String size;
    private int year;

    public Dood (String name, double fee, int quantity, String color, String size, int year){
        
        if (fee < 0) {
            throw new IllegalArgumentException("Adoption fee cannot be less than zero.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than 0");
        }

        if(color == null || color.isBlank()){
            throw new IllegalArgumentException("Color cannot be null/blank");
        }
        if(size == null || size.isBlank()){
            throw new IllegalArgumentException("Size cannot be null/blank");
        }

        if(year < 0){
            throw new IllegalArgumentException("Year cannot be less than 0");
        }

        this.name = name;
        this.fee = fee;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
        this.year = year;
    }

    public Dood(Dood source){  
        this.name = source.name;
        this.fee = source.fee;
        this.quantity = source.quantity;
        this.color = source.color;
        this.size = source.size;
        this.year = source.year;    
    }
    public String getName() {
        return this.name;
    }

    public double getFee() {
        if (fee < 0){
            throw new IllegalArgumentException("Fee cannot be less than 0");
        }
        return this.fee;
    }
    public String getColor() {
        if(color == null || color.isBlank()){
            throw new IllegalArgumentException("Color cannot be null/blank");
        }
        return color;
    }

    public int getQuantity() {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than 0");
        }
        return quantity;
    }

    public String getSize() {
        if(size == null || size.isBlank()){
            throw new IllegalArgumentException("Size cannot be null/blank");
        }
        return size;
    }

    public int getYear() {
        if(year < 0){
            throw new IllegalArgumentException("Year cannot be less than 0");
        }
        return year;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank.");
        }
        this.name = name;
    }

    public void setFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Adoption Fee cannot be less than 0.");
        }
        this.fee = fee;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank()){
            throw new IllegalArgumentException("Color cannot be null/blank");
        }
        this.color = color;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than 0");
        }
        this.quantity = quantity;
    }

    public void setSize(String size) {
        if(size == null || size.isBlank()){
            throw new IllegalArgumentException("Size cannot be null/blank");
        }
        this.size = size;
    }

    public void setYear(int year) {
        if(year < 0){
            throw new IllegalArgumentException("Year cannot be less than 0");
        }
        this.year = year;
    }

    public void adopt() {
        System.out.println("\nYou just adopted the beautiful " + this.name + " for an adoption fee of " + this.fee + ".");
        System.out.println("Please take your furry fren home and have a great day!\n");
    }

    public String toString() {
        return "\tName: " + this.name + ".\n" 
            +  "\tAdoption Fee: " + this.fee + ".\n"
            + "\tColor: " + this.color + ".\n"
            + "\tSize: " + this.size + ".\n"
            + "\tBirth Year: " + this.year + ".\n";
    }

}

