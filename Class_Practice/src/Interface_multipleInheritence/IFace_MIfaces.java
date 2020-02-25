package Interface_multipleInheritence;

public class IFace_MIfaces {

	public static void main(String[] args) {
		
		RKR rk=new RKR();
		rk.btech();
		rk.MBA();
		rk.lang();
		rk.Read();
		rk.write();
		rk.writing();
		rk.reading();
		
		//Dyanamic polymorphisam
		PNR pnr=new RKR();
		pnr.reading();
		pnr.writing();
		pnr.lang();
		
		
		
		

	}

}
