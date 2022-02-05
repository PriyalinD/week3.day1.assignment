package week3.day1.assignment;

public class Desktop extends Computer {
 public void desktopSize()
 {
	 System.out.println("desktopSize->Desktop");
 }
 public static void main(String arg[])
 {
	 Computer c=new Computer();
	 Desktop d=new Desktop();
	 d.computerModel();
	 d.desktopSize();
	 
 }
}
