public class DecodeBarcode
{
	public static String decode(String barcode)
	{
		String bar = barcode;
		
		String one = bar.substring(1, 6);	
		String two = bar.substring(6, 11);
		String three = bar.substring(11, 16);
		String four = bar.substring(16, 21);
		String five = bar.substring(21, 26);
		String check = bar.substring(26, 31);
		
		int first = DecodeDigit.getDigit(one);	
		int second = DecodeDigit.getDigit(two);
		int third = DecodeDigit.getDigit(three);
		int fourth = DecodeDigit.getDigit(four);
		int fifth = DecodeDigit.getDigit(five);
		int checkDigit = DecodeDigit.getDigit(check);
		
		if(first == -1 || second == -1 || third == -1 ||	
				fourth == -1 || fifth == -1 || checkDigit == -1)
			return "Error in barcode";
		else
		{
			int zip = (first * 10000) + (second * 1000) + (third * 100) + (fourth * 10) + fifth;
			
			int testZip = first + second + third + fourth + fifth + checkDigit;
			
			if((testZip % 10) == 0)					//check for errors
				return "ZIP: " + zip;
			else
				return "Error in barcode";
		}
	}
}
