package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;

import model.User;

@XmlRootElement(name ="repository")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserRepository {
	static String pathFile="D:\\EclipseWebWorkspace\\PTI\\src\\main\\webapp\\UserRepository.xml";

    
	
	    static UserRepository instance = null;
	    @XmlElement(name = "User")
	    HashSet<User> h = new HashSet<User>();
	   
	    private UserRepository () {  

	        //h.add(new User(h.size()+1,"viktor", "123", "Viktor","viktor@","Very good","Programmer","Varna","089","Dubrovnik"));
	        //h.add(new User(h.size()+1,"teo", "123", "Teo","td@","not bad","Galush","Sofia","088","Levski"));
	        //h.add(new User(h.size()+1,"Nasko", "123", "Nasko","n@","goood","PRO","Burgas","359","PnVolov"));
	        
	  }
	    
  public void writeToXMLFile(String xmlFile, UserRepository user) throws JAXBException {

	    	
	    	
	 
	    JAXBContext context = JAXBContext.newInstance(UserRepository.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    m.marshal(user, System.out);
	    m.marshal(user, new File(xmlFile));
	    	
	    

	    }
  public void update() {
      try {
    	  writeToXMLFile(pathFile, this);
      } catch (JAXBException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
  }
	    public static UserRepository readerFromXMLFile(String xmlFile) throws JAXBException, FileNotFoundException {

	   
	        JAXBContext context = JAXBContext.newInstance(UserRepository.class);
	        Unmarshaller um = context.createUnmarshaller();
	        UserRepository user;
			
				user = (UserRepository) um.unmarshal(new FileReader(xmlFile));
			
			
			

	        return user;
	    }
	    
	    public void addToTheCollection(User l)
	    {
	    	h.add(l);
	    	update();
	    	}
	    	
	    	

	    public User returnLogin(String uname,String pass)
	    {
	    	
	    	
	    	User l1 = new User();
	    	for(User log:h) {
	    		if(log.getUserUsername().equals(uname)&&log.getUserPass().equals(pass))
	    		{
	    			l1=log;

	    		}
	    				
	    	}
	    	return l1;
	    }
	    
	    
	    public int returnId(String name)
	    {
	    	
	    	
	    	
	    	for(User log:h) {
	    		if(log.getUserUsername().equals(name))
	    		{
	    			return log.getsID();

	    		}
	    				
	    	}
	    	return 0;
	    }
	    
	    public User returnUser(int id)
	    {
	    	
	    	
	    	
	    	for(User log:h) {
	    		if(log.getsID()== id)
	    		{
	    			return log;
	    		}
	    				
	    	}
	    	return null;
	    }
	  
	   

	 
public HashSet<User> getH() {
			return h;
		}


public int UserCount() {
	return h.size();
}



		public void setH(HashSet<User> h) {
			this.h = h;
		}



public boolean isInTheCollection(String uname, String password1)

{
	int count=0;
	for(User log:h) {
		if(log.getUserUsername().equals(uname)&&log.getUserPass().contentEquals(password1))
		{
			count++;
		}
	}
	if (count>0)
	{
		return true;
	}
	
	else
	{
		return false;
	}

	}
static public UserRepository getInstance()
{
    if (instance == null)  {      
         try {
			instance = readerFromXMLFile(pathFile);
		} catch (FileNotFoundException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    else 
    {
    	
    }

    return instance;
}
	

public boolean isInTheCollectionbyname(String uname)

{
	int count=0;
	for(User log:h) {
		if(log.getUserUsername().equals(uname))
		{
			count++;
		}
	}
	if (count>0)
	{
		return true;
	}
	
	else
	{
		return false;
	}

}

}





	
