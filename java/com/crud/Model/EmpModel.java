package com.crud.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class EmpModel {
	@Id
	private String eemail;
	private String ename;
	private String caddress;
	private String paddress;
	
	
	
	public EmpModel() {
		
	}
	public EmpModel(String eemail, String ename, String caddress, String paddress) {
		
		this.eemail = eemail;
		this.ename = ename;
		this.caddress = caddress;
		this.paddress = paddress;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "EmpModel [eemail=" + eemail + ", ename=" + ename + ", caddress=" + caddress + ", paddress=" + paddress
				+ "]";
	}
	
}
