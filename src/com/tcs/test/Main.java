package com.tcs.test;

import org.hibernate.Session;

import com.tcs.model.User;
import com.tcs.utility.HibernateUtil;

public class Main {

	 public void saveUserInfo()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	   User user=new User();
    	   user.setUserId(101);
    	   user.setUserName("PQR");
    	   user.setPassword("pqr@123");
    	   user.setEmailId("pqr@gmail.com");
    	   
    	   session.save(user);
    	 
    	   session.beginTransaction().commit();
    	   
     }
     public void getUserInfo()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	       User user = session.get(User.class, 103);
               System.out.println(user.getUserId());
    	       System.out.println(user.getUserName());
    	       System.out.println(user.getPassword());
    	       System.out.println(user.getEmailId());
    	       
    	       
     }
     public void loadUserInfo()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	User user= session.load(User.class, 103);
    	
     //   System.out.println(user.getUserId());
	   //  System.out.println(user.getUserName());
	   //    System.out.println(user.getPassword());
	   //    System.out.println(user.getEmailId());
     }
     public void updateUser()
     {
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	            User  user= session.get(User.class, 103);
    	            user.setPassword("Vijaya@123");
    	           user.setUserName("Vijaya Patil");
    	            
    	            session.update(user);
    	            session.beginTransaction().commit();
    	            
     }
     public void deleteUser()
     {
    	 Session session =HibernateUtil.getSessionFactory().openSession();
    	  User  user= session.get(User.class, 102);
    	  session.delete(user);
    	  session.beginTransaction().commit();
     }
     public static void main(String[] args) {
		Main main=new Main();
	//	main.saveUserInfo();
		//main.getUserInfo();
		//main.loadUserInfo();
		//main.updateUser();
		main.deleteUser();
		
		
	}
}
