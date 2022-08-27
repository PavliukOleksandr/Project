/**
 * Змінитии - size перенести в Goods
 */
package Goods;

import java.io.FileReader;
import java.io.IOException;

public class Grohe extends Goods {
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Grohe(String title, String series, int article, String type, String color, double priceUe, int quantity,
			String size) {
		super(title, series, article, type, color, priceUe, quantity);
		this.size = size;
	}
}