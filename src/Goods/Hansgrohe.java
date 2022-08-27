/**
 * Змінитии - size перенести в Goods
 */

package Goods;

public class Hansgrohe extends Goods {
	private int size;

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public Hansgrohe(String title, String series, int article, String type, String color, double priceUe, int quantity,
			int size) {
		super(title, series, article, type, color, priceUe, quantity);
		this.size = size;
	}
}
