public class DecodeDigit 
{
	public static int getDigit(String barcode)
	{
		String bar = barcode;
		int digit = 0;
		if(bar.equals("||:::"))	
			digit = 0;
		else if(bar.equals(":::||"))
			digit = 1;
		else if(bar.equals("::|:|"))
			digit = 2;
		else if(bar.equals("::||:"))
			digit = 3;
		else if(bar.equals(":|::|"))
			digit = 4;
		else if(bar.equals(":|:|:"))
			digit = 5;
		else if(bar.equals(":||::"))
			digit = 6;
		else if(bar.equals("|:::|"))
			digit = 7;
		else if(bar.equals("|::|:"))
			digit = 8;
		else if(bar.equals("|:|::"))
			digit = 9;
		else
			digit = -1;		
		return digit;
	}
}
