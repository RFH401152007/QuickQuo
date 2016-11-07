import java.sql.SQLException;
import java.util.*;

public class QuickQuo {


	public static void main(String[] args) {
		boolean isConnected = false;
		// TODO Auto-generated method stub
		System.out.println("Hello QucikQuo");
		System.out.println("change one, test for commiting");
		System.out.println("second change after cloneing project from server");
		System.out.println("--------changes Schaevenstr!----------");
		System.out.println("--------second changes on Elin!-----------");
		
		//opens DB connection
		isConnected = connectToMyDatabase("localhost","testdb","root", "");
		if(isConnected ==true){
			System.out.println("Die Datenbankverbindung zu MySQL wurde erfolgreich geöffnet");
		}
		//close DB connection
		try{
			myConnection.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
