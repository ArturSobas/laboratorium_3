import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;

import javax.swing.JApplet;

public class SpringApplet extends JApplet {
	
	@Override
	public void init() {
		//tworenie obiektow klasy Vector2D
		Vector2D vector1 = new Vector2D(40, 30);
		Vector2D vector2 = new Vector2D(10, -20);
		Vector2D vector3 = new Vector2D();
		
		//Wyswiwtlenie wspolrzednych wektorow naktoryc bedzie operowal program testowy
		System.out.println("Wspolrzedne wektora vector1:\n"
				+ "x = " + vector1.x + "\ny = vector1.y");
		System.out.println("Wspolrzedne wektora vector2:\n"
				+ "x = " + vector2.x + "\ny = " + vector2.y);
		
		//dodawaanie wektorow (vector1 + vector2)
		vector3 = vector1.dodaj(vector2);
		System.out.println("Dodawanie (vector1 + vector2). Wektor wynikowy:\n"
				+ "x = " + vector3.x + "\ny = " + vector3.y);
		
		//odejmowanie wektorw (vector1 - vector2)
		vector3 = vector1.odejmij(vector2);
		System.out.println("Odejmowanie (vector1 - vector2). Wektor wynikowy:\n"
				+ "x = " + vector3.x + "\ny = " + vector3.y);
		
		//mnozenie ewektora przez stala (stala = 3)
		vector3 = vector1.mnozPrzezStala(3);
		System.out.println("Mnozenie wektora vector1 przez stala (stala = 3). Wektor wynikowy:\n"
				+ "x = " + vector3.x + "\ny = " + vector3.y);
		
		//normalizacja wektora (vecto1)
		vector3 = vector1.normalizuj();
		System.out.println("Normalizacja wektora vector1. Wektor wynikowy:\n"
				+ "x = " + vector3.x + "\ny = " + vector3.y);
		
		//obliczanie dlugosci wektora (vector1)
		System.out.println("Dlugosc wektora vector2: " + vector1.dlugoscWektora());
	}

	@Override
	public void paint(Graphics g) {
		
		/*Vector2D wektor1 = new Vector2D(100,200);
		Vector2D wektor2 = new Vector2D(50,300);
		
		setSize(600, 600);
		
		g.setColor(Color.black);
		g.translate(100, 100);
		g.drawString("0,0" , 0, 0);
		g.drawString("0,0", (int)wektor1.x,(int)wektor1.y);
		g.drawLine(200, 0, 200, 400);
		g.drawLine((int)wektor1.x, (int)wektor1.y, (int)wektor2.x, (int)wektor2.y);*/
	}
}