
package Dao;

import Model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class DBManager {
    
    private Statement st;
    
    public DBManager(Connection conn) throws SQLException{
        st = conn.createStatement();
    }
    
    public User findUser (String email, String password) throws SQLException{
        String fetch = "select * from ISDUSER.Users where EMAIL = '" + email + "' and PASSWORD='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
    
    
        while(rs.next()) {
            String userEmail = rs.getString(2);
            String userPass = rs.getString(3);
            if (userEmail.equals(email) && userPass.equals(password)) {
                String userName = rs.getString(1);
                String userDOB = rs.getString(4);
                return new User(userName, userEmail, password, userDOB);
            }
        }
        return null;
    }
    public void addUser(String name, String email, String password, String dob) throws SQLException{
        st.executeUpdate("INSERT INTO ISDUSER.Users " + "VALUES ('" + name + "', '" + email + "', '" + password + "', '" + dob + "', ')");
    }
    
    public void updateUser(String name, String email, String password, String dob) throws SQLException{
         st.executeUpdate("UPDATE ISDUSER.Users SET NAME='" + name + "',PASSWORD='" + password + "',dob='" + dob + "' WHERE EMAIL='" + email + "'");
    }
    
    public void deleteUser(String email) throws SQLException{
        st.executeUpdate("DELETE FROM ISDUSER.Users WHERE EMAIL='" + email + "'");
    }
    
    public ArrayList<User> fectUsers() throws SQLException{
        String fetch = "select * from Users";
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<User> temp = new ArrayList();
        
        while(rs.next()) {
            String name = rs.getString(1);
            String email = rs.getString(2);
            String password = rs.getString(3);
            String dob = rs.getString(4);
            temp.add(new User(name,email,password,dob));
        }
        return temp;
    }
    
    public boolean checkUser(String email, String password) throws SQLException {
        String fetch = "select * from ISDUSER.Users where EMAIL = '" + email + "' and password='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while(rs.next()){
            String userEmail = rs.getString(2);
            String userPass = rs.getString(3);
            if (userEmail.equals(email) && userPass.equals(password)){
                return true;
            }
        }
        return false;
    }

  }

