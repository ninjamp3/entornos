package factura;

/**
 * Clase que crea cada una da las líeas de la factura 
 * @author Angel Vidal 
 * @version 2014
 */

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
/** 
 * Crea un objeto con la información de cada línea de factura. Identificador de rpoducto, nombre de producto, precio, cantidad y descueto
 * @param idProducto
 * @param nombreProducto
 * @param precio
 * @param cantidad
 * @param descuento
 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa uniad 
	 * @return total de productos
	 */
	
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
//cambio1
