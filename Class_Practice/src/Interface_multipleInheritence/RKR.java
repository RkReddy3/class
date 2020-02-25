package Interface_multipleInheritence;

public class RKR implements PNR,PRR
{
	public void reading() {
		System.out.println("PNR can read");
	}
	public void writing() {
		System.out.println("PNR Can Write");
		}
	public void lang() {
		System.out.println("PNR Can speak multiple lang");
		}
	
	public void Read() {
		System.out.println("PRR can Read");
	}
	
	public void write() {
		System.out.println("PRR can Write");
		}
	public void btech() {
		System.out.println("RKR Done his Btech");
	}
	public void MBA() {
		System.out.println("RKR Done his MBA");
	}
}
