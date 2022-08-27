package Goods;

public abstract class Goods {
// статична змінна грн
//використати enum
	private double priceUe;
	private static double priceGrn; // - прабрати
	private static double exchangeRate;// курс валют -прибрати або статична змінна
	private String title;// фірма
	private String color;
	private String series;// назва серії фоделей
	private int article;
	private int quantity;// кількість товару
	private String type;// змішувач раковина ванна

	public double getPriceUe() {
		return priceUe;
	}

	public void setPriceUe(double priceUe) {
		this.priceUe = priceUe;
	}

	public double getPriceGrn() {
		return priceGrn;
	}

	public void setPriceGrn(double priceGrn) {
		this.priceGrn = priceGrn;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Goods(String title, String series, int article, String type, String color, double priceUe, int quantity) {
		super();
		this.priceUe = priceUe;
		// this.priceGrn = priceGrn;                  питання -  чи залишати ці данні в конструкторі - щоб
		// this.exchangeRate = exchangeRate;          мати до них доступ в замміні для всіх данних
		this.title = title;
		this.color = color;
		this.series = series;
		this.article = article;
		this.quantity = quantity;
		this.type = type;
	}
}
