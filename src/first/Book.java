package first;
public class Book
{
private String name;
private String id;
private String aname;
private String br;

	public Book(String a,String b,String c,String d) {
		this.name=a;
		this.id=b;
		this.aname=c;
		this.br=d;		
	}
	public String getname() {return name;}
	public String getid() {return id;}
	public String getAname() {return aname;}
	public String getBranch() {return br;}
}
