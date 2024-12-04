package javaBeans;

public class ProductoTest {
	private static Producto prod1=new Producto();
	private static Producto prod2=new Producto(0, null, 100, 100, null, "S");
	public static void main(String[] args) {
		aumentarStock();
		reducirStock();
		reducirStockIncorrecto();
		precioConIva();
		testPrecioAplicado();
	}
	static public void aumentarStock() {
		prod1.aumentarStock(10);
		System.out.println(prod1.getCantidadStock());//10
	}
	static public void reducirStock() {
		prod1.disminuirStock(5);
		System.out.println(prod1.getCantidadStock());//5
	}
	static public void reducirStockIncorrecto() {
		prod1.disminuirStock(1000);
		System.out.println(prod1.getCantidadStock());//5
	}
	static public void precioConIva() {
		System.out.println(prod2.precioConIva(21));//121
		
	}
	static public void testPrecioAplicado() {
		prod2.precioAplicado("S");
	}
}
