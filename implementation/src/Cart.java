import java.util.Vector;

public class Cart {

  public java.util.Vector products;

  public Integer getPrice() {
    Integer sum = 0;
    for (int i = 0; i < products.length; i++) {
        sum += products[i].price;
    }
    return sum;
  }

  public void checkout() {
      products = null;
      //GGGGGGGGGGGGGGGGGGGGGGGGGGG
  }

  public void addProduct(Product product) {
      products.add(product);
  }

  public void removeProduct(Product product) {
      products.remove(product);
  }

  public void clear() {
     products = null;
  }

}