/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		
		String x = "true";
		String y = "false";
		String z = "false";
		System.out.println(x.equals(y));
		System.out.println(!x.equals(y));
		System.out.println(!(x.equals(z) || y.equals(z)));
		
		String s1 = "The big Frog Ate the Fly";
		String s2 = "I love Mississippi";
		System.out.println("a = " + s1.indexOf("i"));
		System.out.println("b = " + s2.indexOf("i"));
		System.out.println("c = " + s1.indexOf("Ate"));
		
		String s3 = "The big Frog Ate the Fly";
		String s4 = "I love Mississippi";
		System.out.println("a = " + s3.substring(20));
		System.out.println("b = " + s3.substring(0,4));
		System.out.println("c = " + s4.substring(2,6));
		
		/**String s5 = "Superman is better than Batman";
		String s6 = s5.substring(s5.indexOf("better"), 11);
		
		System.out.println("Batman is" + s6 + s5.substring(0,8));
		*/
		
		/**String pStr = "I like Puppies";
		String cStr = "Cats are useless";
		
		if(pStr.indexOf("Puppies") >= 0 && cStr.indexOf("Cats") >= 0)
		{
		    System.out.println("I Like cats");
		}
		else
		{
		    System.out.println("I Like puppies");
		}*/
		
		String str = "ABC 123, efg";
		System.out.println(str.substring(4,6));
		System.out.println(str.substring(str.indexOf(",") + 2));
		System.out.println(str.substring(str.indexOf("a") + 1));
		System.out.println(str.substring(str.indexOf(" ") + 1, str.indexOf(",")));
	}

}
