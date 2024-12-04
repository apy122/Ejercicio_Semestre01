package javaBeans;

public class Producto {
	private long codigoProducto;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;

	public Producto(long codigoProducto, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoProducto = codigoProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}
	
	public Producto() {
		super();
	}
	
	public long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "producto [codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}

	public double precioConIva(int iva) {
		double totalConIva=(iva/100)*precioUnitario;
		return totalConIva;
	}
	
	public void aumentarStock(int cantidad) {
		this.cantidadStock +=cantidad;
	}
	public boolean disminuirStock(int cantidad) {
		if (cantidadStock< cantidad) {
			return false;
		}else {
			cantidadStock-=cantidad;
			return true;
		}
	}
	public double precioAplicado(String talla) {
		
		switch(talla) {
		case "XS":
			return precioUnitario;
		case "S":
			return precioUnitario*1.3;
		case "M":
			return precioUnitario*1.3;
		case "L":
			return precioUnitario*1.3;
		case "XL":
			return precioUnitario*1.3;
		case "XXL":
			return precioUnitario*1.4;
		case "XXXL":
			return precioUnitario*1.4;
		default:
			break;

		}
	}
}
