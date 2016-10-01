package kdk;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Interfejs
{

	public static void main(String[] args)
	{
		
//		
//		SimpleDateFormat d = new SimpleDateFormat("MM.dd.mm.hh");
//		Date date = null;
//		
//		 
//			try
//			{
//				date = d.parse("02.22.34.21");
//			} catch (java.text.ParseException e)
//			{
//				System.out.println("Coœ nie tak z formatem daty");
//			}
//		System.out.println(date);
		Kot kot = new Kot();
System.out.println("Jakie jest imiê kota? ");
kot.imie= Kot.getUserInput();
System.out.println("Jakie jest imiê opiekuna? ");
kot.imieOpiekuna = Kot.getUserInput();

System.out.println("Imiê kota to: "+kot.imie+" , imiê opiekuna to: "+kot.imieOpiekuna);

	}

}
