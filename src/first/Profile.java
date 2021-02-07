package first;

public class Profile {
		private String Sid;
		private String bid;
		private String bname;
		private String Aname;
		private String Br;
		private String date;
		  
		public Profile(String Sid,String bid,String bname,String Aname,String Br,String date )
		{
			this.Sid=Sid;
			this.bid=bid;
			this.bname=bname;
			this.Aname=Aname;
			this.Br=Br;
			this.date=date;
		}
		
		public String getid() {return Sid;}
		public String getBid() {return  bid;}
		public String getBname() {return bname;}
		public String getAname() {return Aname;}
		public String getBranch() {return Br;}
		public String getDate() {return date;}

}
