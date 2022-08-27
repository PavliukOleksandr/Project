/**
 * Змінитии - size перенести в Goods
 */
package Goods;

import java.io.FileReader;
import java.io.IOException;

public class Roca extends Goods {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Roca(String title, String series, int article, String type, String color, double priceUe, int quantity,
			int size) {
		super(title, series, article, type, color, priceUe, quantity);
		this.size = size;
	}
}
