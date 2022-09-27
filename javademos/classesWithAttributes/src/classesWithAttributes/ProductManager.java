package classesWithAttributes;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Product Added " + product.getCode());
	}
	
	public void Add2(int id, String name, String description) {
		System.out.println("Product Added " + name);
	}
}
