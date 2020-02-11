package chapter3;

public class StringAlignSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construct a "formatter" to center strings.
		StringAlign formatter = new StringAlign(70, StringAlign.Justify.RIGHT);
		// Try it out, for page "i"
		System.out.println(formatter.format("- i -"));
		// Try it out, for page 4. Since this formatter is
		// optimized for Strings, not specifically for page numbers,
		// we have to convert the number to a String
		System.out.println(formatter.format(Integer.toString(4)));
	}

}
