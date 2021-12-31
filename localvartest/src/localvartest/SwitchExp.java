package localvartest;

public class SwitchExp {
	public void m(int k) {
		System.out.println(
		        switch (k) {
		            case  1 -> "one";
		            case  2 -> "two";
		            default -> "many";
		        }
		    );
	}
}
