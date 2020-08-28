package controller;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;
/**
 *
 * @author giann
 */
public class Validator implements Serializable{     //checks each  input format for correct characters
    
    private String emailPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";
    private String namePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";
    private String passwordPattern = "([a-z]{4,})([0-9]*)";
    //private String cnamePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";
    //private String cnumberPattern = "({16,}([0-9])*)";
    private String stockPattern = "({3,}([0-9])*)";
    private String pricePattern = "((([0-9])([0-9]))([ ])(([0-9])([0-9]))([.])(([0-9])([0-9]))*)";
    private String typePattern = "(([Mouse])([Keyboard])([Monitor])([Case])([Motherboard])([GPU])([CPU])*)";
    
    
    public Validator() {
    }
    
    public boolean validate(String pattern, String input) {
        Pattern regEx = Pattern.compile(pattern);
        Matcher match = regEx.matcher(input);
        return match.matches();
    }
    
    public boolean validateEmail(String email) {
        return validate(emailPattern, email);
    }
    
    public boolean validateName(String name) {
        return validate(namePattern, name);
    }
    
    public boolean validatePassword(String password) {
        return validate(passwordPattern, password);
    }
    
    public void clear(HttpSession session) {
       // session.setAttribute("emailErr", "Enter email");
        session.setAttribute("passErr", "Enter password");
        session.setAttribute("existErr", "");
        session.setAttribute("nameErr", "Enter name");
        session.setAttribute("prodstockErr", "Enter stock number");
        session.setAttribute("prodpriceErr", "Enter product price");
        session.setAttribute("prodtypeErr", "Enter product type");
        //session.setAttribute("cardnameErr", "Enter card name");
        
    }
    
    
    
    public boolean validateProdname(String prodname){
        return validate(namePattern, prodname);
    }
    
    public boolean validateStock(String stock){
        return validate(stockPattern, stock);
    }
    
    public boolean validatePrice(String price){
        return validate(pricePattern, price);
    }
    
    public boolean validateType(String type){
        return validate(typePattern, type);
    }
}
