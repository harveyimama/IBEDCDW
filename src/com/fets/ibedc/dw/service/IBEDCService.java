package com.fets.ibedc.dw.service;

public class IBEDCService {

	public void DoETL() {
		
		System.out.println("came here ");
		
		try {
			
			DataBaseService con  = new DataBaseService();

			int id = con.getLastID();
			
			if(id > 0)
			id = con.saveData(id);
			
			if(id > 0)
			con.saveLastId(id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
