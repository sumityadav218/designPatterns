package singletonRealExample;
public class MyApp {
    public static void main(String[] args) {
      
    	
    	// Get the singleton instance
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Connect to the database
        connection.connect();
        
        // Perform database operations...
        
        // Disconnect from the database
        connection.disconnect();
    }
}
