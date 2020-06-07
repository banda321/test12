package com.ranjan.hibernet.Hiberdemonet;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
	{/*
		 * Laptop laptop=new Laptop(); laptop.setLid(100); laptop.setLname("KP");
		 * 
		 * 
		 * Student student=new Student(); student.setSid(2); student.setSname("H");
		 */
  
        //student.setLaptop(laplist);
        //student.getLaptop().add(laptop);
    	Member mber=new Member();
		
		 // mber.setId(4); mber.setName("Kamib"); mber.setColor("white");
		
    	//Configuration conf=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		  Configuration conf=new Configuration().configure().addAnnotatedClass(Member.class);
    	ServiceRegistry ser=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf=conf.buildSessionFactory(ser);
        Session ssn=sf.openSession();
        //ssn.update(mber);
       // ssn.save(mber);
        Transaction tx=ssn.beginTransaction();
        ssn.getTransaction().commit();
        
        		//System.out.println(mber);
        Member m=(Member)ssn.load(Member.class,4);
        System.out.println(m);
        Session ssn1=sf.openSession();
        Member m1=(Member)ssn.get(Member.class,4);
        System.out.println(m1);
        //ssn.save(mber);
        //ssn.save(mber);
        
       //ssn.save(mber);
        tx.commit();
        /*Member mbertofetch=(Member)ssn.get(Member.class, mber.getId());
        System.out.println(mbertofetch);
        List <Member> mylst=new ArrayList<Member>();
       
        for(Member x:mylst){
        	System.out.println(x);
        }
        */
        //System.out.println(mber);
        
    }
}
