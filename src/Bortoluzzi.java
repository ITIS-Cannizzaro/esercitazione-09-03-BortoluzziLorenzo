import java.util.Scanner;

public class Bortoluzzi
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{

		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				System.out.println("quanti numeri  vuoi inserire?");
				int n = Integer.parseInt(in.nextLine());
				double[]array = new double [n];
				riempi_array(array);
				stampa(array);
				double[]array1 = prodottoArray(array);
				stampa(array1);
				break;
			case 2:
				String[]arrayS= new String[5];
				riempi_stringhe(arrayS);
				String[]arrayS2= new String[5];
				riempi_stringhe(arrayS2);
				Duesequenze(arrayS,arrayS2);
				break;

			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Prodotti array *");
		System.out.println("2 - Es n. * - Titolo es. *");

	}
	public static void  riempi_array(double[] array) 
	{
		int n = array.length;
		for(int i=0; i<n; i++) 
		{
			array[i]=Math.round((Math.random() * 10)*100.0)/100.0;

		}
	}
	public static void stampa(double array []) 
	{
		int n = array.length;
		for(int i = 0; i<n; i++) 
		{
			System.out.print(array[i]+" | ");
		}
		System.out.println();
	}
	public static double[] prodottoArray(double[] array) 
	{

		int n = array.length;
		double[] array1 = new double[n/2];
		for(int i=0; i<n; i=i+2) 
		{		
			array1[i/2]= array[i]*array[i+1];
			array1[i/2]= Math.round (array1[i/2]*100.0)/100.0;
		}	
		return array1;
	}
	public static void Duesequenze(String[]array, String[] array1) 
	{
		int n = array.length;
		boolean uguali = false;
		for (int i=0; i<n; i++)
			for (int j=0; j<n;j++)
			{
				if(array[i].equals(array1[j])) 
				{
					uguali =true;
					System.out.println(array[i]+" "+i+" "+j);

				}


			}
		if(uguali==false)
			System.out.println("NO");
		else
			System.out.println("OK");
	}
	public static void  riempi_stringhe(String[]array)
	{
		int n = array.length;
		for(int i =0; i<n; i++)
		{
			System.out.println("inserisci una stringa");
			array[i]= in.nextLine();		
		}
	}
}



