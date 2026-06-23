package kce;
interface Printable{
	void display();
}
interface Scannable{
	void display();
}
class PrinterMachine implements Printable,Scannable{
	public void display()
{System.out.println("Printing and Scanning");
		}
}
public class ex4 {

	public static void main(String[] args) {
		
		PrinterMachine pm = new PrinterMachine();

        pm.display();
	}

}
