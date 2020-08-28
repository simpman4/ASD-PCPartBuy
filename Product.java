
package Model;


import java.io.Serializable;

public class Product implements Serializable
{
    private String name;
    private int prid;
    private String type;
    private double price;
    private int stock;
    
    public Product(String name, int prid, String type, double price, int stock)
    {
        this.name = name;
        this.prid = prid;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //public void printProds(String name, int prid, String type, double price, int stock){
      //  print(Product);
   // }
    
    
}
