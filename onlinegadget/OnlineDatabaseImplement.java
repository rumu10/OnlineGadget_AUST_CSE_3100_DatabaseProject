/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinegadget;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class OnlineDatabaseImplement {
    Connection connect = null;
    Statement statement = null;
    PreparedStatement pStatement = null;
    ResultSet result = null;
    int id,product_id,product_quantity;
    String address;
    String starCustomer;
//    public void signup(String name,String phone,String userName,String password)
//    {
//        connect=ConnectionConfiguration.setConnection();
//    }
    
    public boolean adminlogin(String user,String pass){
        boolean check=false;
        connect=ConnectionConfiguration.setConnection();
         try {   
                 pStatement = connect.prepareStatement("SELECT * FROM  admin WHERE username= ? and password= ?");
                 pStatement.setString(1, user);
                 pStatement.setString(2, pass);
                result =   pStatement.executeQuery();
                if(result.next())
                {
                    check=true;
                }
                 
          }catch (Exception e) {
              
                JOptionPane.showMessageDialog(null, e);
                
                
            }
         return check;
    }
    
    
    
    public void userChangePassword(String user, String oldPass ,String newPass)
    {
         connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("update customer set password ='"+newPass+"' where username='"+user+"' and password='"+oldPass+"'");
            pStatement.executeUpdate();
            System.out.println("Password Changed");

        } catch (Exception e) {
            e.printStackTrace();
    }
    }
    
    
    
     public void adminChangePassword(String user, String oldPass ,String newPass)
    {
         connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("update admin set password ='"+newPass+"' where username='"+user+"' and password='"+oldPass+"'");
            pStatement.executeUpdate();
            System.out.println("Password Changed");

        } catch (Exception e) {
            e.printStackTrace();
    }
    }
     
     
     
    public void signup(String name,String phone,String userName,String password)
    {
        connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("INSERT INTO customer (customer_name,phone,username,password)"
                    + "VALUES (?,?,?, ?)");

            pStatement.setString(1,name);
            pStatement.setString(2, phone);
            pStatement.setString(3, userName);
            pStatement.setString(4, password);
          

           pStatement.executeUpdate();
            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
    }
}
    
    
    
    public ResultSet showImage(String brand){
         connect=ConnectionConfiguration.setConnection();
         try{
            String query="SELECT * FROM product WHERE brand='"+brand+"'";
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return result;
    }
    
    
    public ResultSet showDetails(String product_name){
        
        
         connect=ConnectionConfiguration.setConnection();
         try{
            String query="SELECT * FROM product WHERE product_name='"+product_name+"'";
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return result;
        
    }
    
    
    public boolean login(String user,String pass)
    {
        boolean check=false;
        connect=ConnectionConfiguration.setConnection();
         try {   
                 pStatement = connect.prepareStatement("SELECT * FROM  customer WHERE username= ? and password= ?");
                 pStatement.setString(1, user);
                 pStatement.setString(2, pass);
                result =   pStatement.executeQuery();
                if(result.next())
                {
                    check=true;
                }
                 
          }catch (Exception e) {
              
                JOptionPane.showMessageDialog(null, e);
                
                
            }
         return check;

}
    
    
    
 public ResultSet getCustomerId(String user)
{
    connect=ConnectionConfiguration.setConnection();
   
         try{
            String query="SELECT customer_id FROM customer WHERE username='"+user+"'";
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
          
            
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return result;
        
    
}
 
 
 
public void insertCart(int product_id,int product_quantity,int customer_id,String address)
    {
        connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("INSERT INTO cart (product_id,product_quantity,customer_id,address)"
                    + "VALUES (?,?,?,?)");

            pStatement.setInt(1,product_id);
            pStatement.setInt(2, product_quantity);
            pStatement.setInt(3, customer_id);
            pStatement.setString(4, address);
          

           pStatement.executeUpdate();
            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
    }
         
}



//
//public void insertProduct(String name,Blob image,String price,String brand,String camera,String ram,String os,String processor,String display) {
//
//       connect=ConnectionConfiguration.setConnection();
//
//        try {
//           
//            pStatement = connect.prepareStatement("INSERT INTO product (product_name,image,brand,price,camera,ram,os,processor,display)"
//                    + "VALUES (?,?,?, ?,?,?,?,?,?)");
//
//           
//            
//             pStatement.setString(1, name);
//            
//              pStatement.setBlob(1,is);
//             pStatement.setString(2, brand);
//             pStatement.setString(3, price);
//             pStatement.setString(4, camera);
//             pStatement.setString(5, ram);
//             pStatement.setString(6, os);
//             pStatement.setString(7, processor);
//             pStatement.setString(8, display);
//
//             pStatement.executeUpdate();
//            System.out.println("inserted");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//}

 
 public void insertOrder(int cart_id,int product_id,int customer_id,int amount,String payment_type,int pin)
    {
        connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("INSERT INTO orderTable (cart_id,product_id,customer_id,amount,payment_type,pin)"
                    + "VALUES (?,?,?,?,?,?)");
            pStatement.setInt(1,cart_id);
            pStatement.setInt(2,product_id);
            pStatement.setInt(3,customer_id );
            pStatement.setInt(4, amount);
            pStatement.setString(5, payment_type);
            pStatement.setInt(6,pin);
          

            pStatement.executeUpdate();
            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
    }
         
}
 
 
 
  public ArrayList getCartData(int id){
           connect=ConnectionConfiguration.setConnection();
        
        
        try{
            String query="select customer.customer_name,product.product_name,cart.product_quantity,cart.date from product inner join cart on product.product_id=cart.product_id inner join customer on cart.customer_id=customer.customer_id where customer.customer_id="+id;
           // pStatement.setInt(1,id);
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
         ArrayList<String> columnName = null;
        try{
            columnName = new ArrayList<String>();
             for(int i = 1 ; i <=result.getMetaData().getColumnCount(); i++){
                    columnName.add(result.getMetaData().getColumnName(i));
                }
        }catch(Exception e){
            e.printStackTrace();
        }
        return columnName;
    }
  
public ResultSet getTableData()
{
    return result;
}
      
      
public ArrayList getColumnNames(String tablename){


    connect=ConnectionConfiguration.setConnection();
    System.out.println("table=" +tablename);
    try{
    String query="SELECT product_id,product_name,price,brand,camera,ram,os,processor,display FROM "+tablename;
    statement=connect.createStatement();
    result=statement.executeQuery(query);
    System.out.println("Successfull Query..");

    }catch(Exception e){
     System.out.println("Error in Query..");
     e.printStackTrace();
    }
    ArrayList<String> columnName = null;
    try{
        columnName = new ArrayList<String>();
        for(int i = 1 ; i <=result.getMetaData().getColumnCount(); i++){
             columnName.add(result.getMetaData().getColumnName(i));
         }
    }catch(Exception e){
     e.printStackTrace();
    }
    return columnName;
}
  
public ArrayList getColumnName(String tname)
{
        
        
    connect=ConnectionConfiguration.setConnection();
    System.out.println("table=" +tname);
    try{
       String query="SELECT * FROM "+tname;
       statement=connect.createStatement();
       result=statement.executeQuery(query);
       System.out.println("Successfull Query..");

   }catch(Exception e){
       System.out.println("Error in Query..");
       e.printStackTrace();
   }
    ArrayList<String> columnName = null;
   try{
       columnName = new ArrayList<String>();
        for(int i = 1 ; i <=result.getMetaData().getColumnCount(); i++){
               columnName.add(result.getMetaData().getColumnName(i));
           }
   }catch(Exception e){
       e.printStackTrace();
   }
   return columnName;
 }
      
    public void delete(String tablename, String col,String row)
    {

         connect=ConnectionConfiguration.setConnection();
    try{
        String query="DELETE FROM "+tablename+" WHERE "+col+ "='"+row+"'";
        System.out.println(query);
        statement=connect.createStatement();
        statement.executeUpdate(query);
        System.out.println("Successfull Query..");

    }catch(Exception e){
        System.out.println("Error in Query..");
        e.printStackTrace();
    }

}

    
public void update(String tab,String value,String selectedColumn,String col,String selected_row)
{

    connect=ConnectionConfiguration.setConnection();

   try{
       String query="update"+" "+tab+" set "+selectedColumn+" = "+"'"+value+"'" + " where" + " " +col+ " ="+selected_row;
       System.out.println("updateeeeeeeee="+query);
       statement=connect.createStatement();
       statement.executeUpdate(query);
       System.out.println("Successfull Query..");

   }catch(Exception e){
       System.out.println("Error in Query..");
       e.printStackTrace();
   }
}

public ResultSet getCartId()
{
    connect=ConnectionConfiguration.setConnection();

    try{
       String query="select cart_id from cart order by cart_id desc limit 1";
       statement=connect.createStatement();
       result=statement.executeQuery(query);
       System.out.println("Successfull Query..");



   }catch(Exception e){
       System.out.println("Error in Query..");
       e.printStackTrace();
   }
   return result;
 }



 public String getAddress(String id)
 {
     connect=ConnectionConfiguration.setConnection();

         try{
            String query="select ordertable.order_id,cart.address from cart inner join ordertable on cart.cart_id=ordertable.cart_id where order_id="+id;
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            while(result.next())
            {
            address=result.getString("address");
            System.out.println("address= "+address);
           
            }
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
            
        }
     return address;
  
}
 
 
 
 public int getProduct_id(String id)
 {
     connect=ConnectionConfiguration.setConnection();

         try{
            String query="select cart.product_id from cart inner join ordertable on cart.cart_id=ordertable.cart_id where order_id="+id;
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            while(result.next())
            {
            product_id=result.getInt("product_id");
            System.out.println("address= "+address);
           
            }
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
            
        }
     return product_id;
  
}
 
 
 
 public int getProduct_quantity(String id)
 {
     connect=ConnectionConfiguration.setConnection();

         try{
            String query="select cart.product_quantity from cart inner join ordertable on cart.cart_id=ordertable.cart_id where order_id="+id;
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            while(result.next())
            {
            product_quantity=result.getInt("product_quantity");
            System.out.println("address= "+address);
           
            }
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
            
        }
     return product_quantity;
  
}
 
 
 
 public void insertCourier(int order_id,int id,int q,String address)
    {
        connect=ConnectionConfiguration.setConnection();
         try {
           
            pStatement = connect.prepareStatement("INSERT INTO courier (order_id,product_id,product_quantity,adderess)"
                    + "VALUES (?,?,?,?)");

            pStatement.setInt(1,order_id);
          
            pStatement.setInt(2, id);
            pStatement.setInt(3,q);
          
            pStatement.setString(4, address);
          

           pStatement.executeUpdate();
            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
    }
}
public String seeStarCustomer()
 {
     connect=ConnectionConfiguration.setConnection();

         try{
            String query=" select customer_name from customer where \n" +
"customer_id=(select customer_id from ordertable where \n" +
"amount=(select max(amount) from ordertable where \n" +
"delivery_status='delivered'))";
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Successfull Query..");
            while(result.next())
            {
            starCustomer=result.getString("customer_name");
            System.out.println("address= "+address);
           
            }
            
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
            
        }
     return starCustomer;
  
}
public ArrayList getSentProduct()
{
        
        
    connect=ConnectionConfiguration.setConnection();
   
    try{
       String query="select product.product_id,product.product_name,cart.cart_id,\n" +
"customer.customer_name from courier inner join product on \n" +
"courier.product_id=product.product_id inner join cart on \n" +
"cart.product_id=product.product_id inner join customer on \n" +
"cart.customer_id=customer.customer_id";
       statement=connect.createStatement();
       result=statement.executeQuery(query);
       System.out.println("Successfull Query..");

   }catch(Exception e){
       System.out.println("Error in Query..");
       e.printStackTrace();
   }
    ArrayList<String> columnName = null;
   try{
       columnName = new ArrayList<String>();
        for(int i = 1 ; i <=result.getMetaData().getColumnCount(); i++){
               columnName.add(result.getMetaData().getColumnName(i));
           }
   }catch(Exception e){
       e.printStackTrace();
   }
   return columnName;
 }
}   
    