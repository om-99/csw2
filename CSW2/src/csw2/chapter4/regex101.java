package csw2.chapter4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regex101 {

	public static void main(String[] args) {
		String text = "This is the text to be searched http:// pattern";
		String regex = ".*http://.*";
		
		// 1st way of pattern matching
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		boolean b = m.matches();
		
		// 2nd way of pattern matching
		boolean b1 = Pattern.compile(regex).matcher(text).matches();
		
		// 3rd way of pattern matching
		boolean b2 = Pattern.matches(regex, text);
		
		System.out.println(b+" "+b1+" "+b2);
		
		int count = 0;
		while(m.find()) {
			count++;
			System.out.println("Found: "+count+": "+m.start()+" - "+m.end());
		}
	}

}
