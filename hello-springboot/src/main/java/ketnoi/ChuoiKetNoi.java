package ketnoi;

public class ChuoiKetNoi {
	public String name="root";
	public String pass="9542";
	
	 String sql = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "group12","optimal-harbor-167402:asia-east1:group12");
	
	
//	public String sql="jdbc:mysql://localhost:3306/ckeditor";
//	public String name="root";
//	public String pass="9542";
	
	
	public String getSQL()
	{
		return sql;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
}
