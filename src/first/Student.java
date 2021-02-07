package first;

public class Student {
	private String ID;
	private String Email;
	private String fname;
	private String lname;
	private String dob;
	private String br;
	private String sem;
	private String add;
	private String ph;


		public Student(String a,String b,String c,String d,String e,String f,String g,String h,String i) {
			this.ID=a;
			this.Email=b;
			this.fname=c;
			this.lname=d;
			this.br=e;
			this.sem=f;
			this.add=g;
			this.ph=h;
			this.dob=h;
		}
		public String getid() {return ID;}
		public String getEm() {return Email;}
		public String getfname() {return fname;}
		public String getlname() {return lname;}
		public String getBranch() {return br;}
		public String getSem() {return sem;}
		public String getadd() {return add;}
		public String getph() {return ph;}
		public String getdob() {return dob;}
			}