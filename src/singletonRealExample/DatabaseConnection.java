package singletonRealExample;

public class DatabaseConnection {
   
	private static DatabaseConnection instance;
    
    private DatabaseConnection() {
        // Private constructor to prevent instantiation from outside the class
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    
    public void connect() {
        // Code to establish a database connection
        System.out.println("Connected to the database");
    }
    
    public void disconnect() {
        // Code to disconnect from the database
        System.out.println("Disconnected from the database");
    }
    
    // Other methods and variables...
}

