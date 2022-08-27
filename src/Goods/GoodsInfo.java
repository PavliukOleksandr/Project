/**
 * Написано далеко не по конвеншену
 * замтки в основному розраховані під мене
 * рядок 50 і 52 - це для того щоб правильно задати параметри
 * коли розберусь з лістом - зможу писати код для пошуку посимвольно - бракує візуалазіції
 */
package Goods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class GoodsInfo {
	static ArrayList<Hansgrohe> list = new ArrayList<>();
	private static String path = ".\\src\\Goods";
	private static String fileName = "Goods.txt";
	private static String line = null;

	public static void main(String[] args) {
		Xxx();
		Reading();
		System.out.println(Exchange(43));
		Exchange(43);
	}

	/**
	 * ДОРОБИТИ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	public static double Exchange(double priceUe) {
		double Grn = 0.0;
		for (Hansgrohe hansgrohe : list) {
			Grn = hansgrohe.getPriceUe() * hansgrohe.getExchangeRate();
		}
		return Grn;
	}
// ось тут основна біда!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void Xxx() {
		try (FileReader reader = new FileReader(path + File.separator + fileName)) {
			BufferedReader bufferedReader = new BufferedReader(reader);

			while ((line = bufferedReader.readLine()) != null) {
				String[] res = line.split("\\W+");
				// String title, String series, int article, String type,
				list.add(new Hansgrohe(res[0], res[1], Integer.parseInt(res[2]), res[3],
						// String color, double priceUe, int quantity, int size
						res[4], Double.parseDouble(res[5]), Integer.parseInt(res[6]), Integer.parseInt(res[7])));
			}
			for (Hansgrohe hs : list) {
				System.out.println(hs);
			}
		} catch (Exception e) {
			System.out.println("Catch 2");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	/// Пошук по назві серії
	public static Hansgrohe hansgrohe(String series) {
		Hansgrohe current = null;
		for (Hansgrohe hansgrohe : list) {
			if (hansgrohe.getSeries() == series) {
				current = hansgrohe;
				break;
			}
		}
		return current;
	}

	// пощук по артикулу - не правильно, метод повторюється
	public static Hansgrohe hansgrohe(int article) {
		Hansgrohe current = null;
		for (Hansgrohe hansgrohe : list) {
			if (hansgrohe.getArticle() == article) {
				current = hansgrohe;
				break;
			}
		}
		return current;
	}

	public static void Reading() {
		try (FileReader reader = new FileReader(path + File.separator + fileName)) {
			int c;
			while ((c = reader.read()) != -1) {
				List<Character> qwerty = new ArrayList<Character>();
				qwerty.add((char) c);
				System.out.print((char) c);
			}
			System.out.println(" ");
			System.out.println(" ");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
