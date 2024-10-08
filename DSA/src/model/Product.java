package model;
import java.util.Arrays;
public class Product {
        private String name;
        private double price;
        private int id;
        //    private double [] report;
        public Product(){
        }
        public Product(int id,String name,double price){
            this.id=id;
            this.name=name;
            this.price=price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString(){
            return "ID: " + getId() + " Name: " + getName() + " Price: " + getPrice();
        }
}
