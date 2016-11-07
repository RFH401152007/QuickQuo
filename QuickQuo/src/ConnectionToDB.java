import java.sql.*;

public class ConnectionToDB {
	static Connection myConnection = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static boolean connectToMyDatabase(String host, String database, String user, String passwd){
		try{
			//Laden des Treibers
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Verbindung zur Datenbank, Liefert ein Statement, hier: myConnection
			String connectionCommand = "jdbc:mysql://"+host+"/"+database+"?user="+user+"&password="+passwd;
			myConnection = DriverManager.getConnection(connectionCommand);
			//Ein Befehlsobjekt: Kann Befehle ausführen
			stmt = myConnection.createStatement();
			rs = stmt.executeQuery("select * FROM XXXX");
					while (rs.next()){
						int id = rs.getInt("id");
						String vorname = rs.getString("vorname");
						String name = rs.getString("name");
						System.out.println("ID: "+ id +" Vorname: "+vorname+" Name: "+name);
					}
			return true;
		}
		catch (Exception ex){
			System.out.println("false");
		}
	}

}
