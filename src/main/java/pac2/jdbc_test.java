package pac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://127.0.0.1:3306/aug4th2025";
		String user="root";
		String password="Hema@2212";
		try(Connection con=DriverManager.getConnection(url,user,password))
		{
			System.out.println("Connect to DB");
			String insertsql="INSERT INTO student(id,name,age) VALUES(?,?,?)";
		
			try(PreparedStatement pstmt=con.prepareStatement(insertsql))
			{
				pstmt.setInt(1, 104);
				pstmt.setString(2, "Chandra");
				pstmt.setInt(3, 25);
				int rows=pstmt.executeUpdate();
				System.out.println("Inserted:"+rows);
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		
String readsql="SELECT * FROM student";
		
		try(Statement stmt=con.createStatement())
				{
					ResultSet rs=stmt.executeQuery(readsql);
					
					while(rs.next())
					{
						System.out.println("id:"+rs.getInt("id"));
						System.out.println("name:"+rs.getString("name"));
						System.out.println("id:"+rs.getInt("age"));
					}
					
				}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		String updatesql="UPDATE student SET name=? WHERE id=?";
		
		try(PreparedStatement pstmt1=con.prepareStatement(updatesql))
		{
			pstmt1.setString(1, "Hemasri");
			pstmt1.setInt(2, 101);
			int rows=pstmt1.executeUpdate();
			System.out.println("Updated:"+rows);
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
String deletesql="DELETE FROM student WHERE id=?";
		
		try(PreparedStatement pstmt2=con.prepareStatement(deletesql))
		{
		
			pstmt2.setInt(1, 101);
			int rows=pstmt2.executeUpdate();
			System.out.println("Delete:"+rows);
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}
	}