package inheritence_poly_Overriding;

public class Reddy_Family {

	public static void main(String[] args) {
		//========================================
		rkreddy rk=new rkreddy();//Static poly morpisam
		rk.degree();
		rk.reading();
		rk.agriculture();
		rk.education();
		rk.PG();
		rk.degree();
		rk.name();
		System.out.println("================================");
		//========================================
		narasimhareddy pnr=new narasimhareddy();
		pnr.reading();
		pnr.agriculture();
		pnr.reading();
		pnr.name();
		System.out.println("================================");
		//========================================
		//---Top Casting---
		narasimhareddy pnr1=new rkreddy();
		pnr1.agriculture();
		pnr1.education();
		pnr1.reading();
		System.out.println("================================");
		//========================================
		System.out.println("---Down Casting---");
		rkreddy rk1=(rkreddy) new narasimhareddy();//ClassCastException
		rk1.agriculture();
		rk1.degree();
		rk1.name();
		rk1.education();
		rk1.PG();
		rk1.degree();
		System.out.println("================================");
		
	}
}
