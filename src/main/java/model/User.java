package model;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

import model.UserRepository;
@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements java.io.Serializable{
	
	private int incID=0;
	private  int sID=0;
	

	private String userUsername;
	
	private String userPass;
	private String userName;
	private String userEmail;
	private String userDescription;
	private String userJob;
	private String userCity;
	private String userPhoneNumber;
	private String userStreet;
	private int java ;
	private int html ;
	private int css;
	private int javaScript;
	private int communicative;
	private int teamwork;
	private int creativity;
	
	
	public User() {};
	
	
	public User(String username, String password, String name)
	{
		super();
		
		this.userUsername=username;
		this.userPass=password;
		this.userName=name;
		
	
    	
		sID=UserRepository.getInstance().getH().size()+1;
		
	}

	
	
	
	public User( String userUsername, String userPass, String userName, String userEmail,
			String userDescription, String userJob, String userCity, String userPhoneNumber, String userStreet) {
		super();
		
		this.userUsername = userUsername;
		this.userPass = userPass;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDescription = userDescription;
		this.userJob = userJob;
		this.userCity = userCity;
		this.userPhoneNumber = userPhoneNumber;
		this.userStreet = userStreet;
		
		
		
		if(UserRepository.instance==null)
			sID=1;
		else
	UserRepository.getInstance();
		
		sID=UserRepository.getInstance().getH().size()+1;
	}

	
	
	public User( int id , String userUsername, String userPass, String userName, String userEmail,
			String userDescription, String userJob, String userCity, String userPhoneNumber, String userStreet) {
		super();
		
		this.userUsername = userUsername;
		this.userPass = userPass;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDescription = userDescription;
		this.userJob = userJob;
		this.userCity = userCity;
		this.userPhoneNumber = userPhoneNumber;
		this.userStreet = userStreet;
	
		this.sID=id;
	}
	

	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserDescription() {
		return userDescription;
	}


	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}


	public String getUserJob() {
		return userJob;
	}


	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}


	public String getUserCity() {
		return userCity;
	}


	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}


	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}


	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}


	public String getUserStreet() {
		return userStreet;
	}


	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}


	public void setsID(int sID) {
		this.sID = sID;
	}


	
	
	public int getCommunicative() {
		return communicative;
	}


	public void setCommunicative(int communicative) {
		this.communicative = communicative;
	}


	public int getTeamwork() {
		return teamwork;
	}


	public void setTeamwork(int teamwork) {
		this.teamwork = teamwork;
	}


	public int getCreativity() {
		return creativity;
	}


	public void setCreativity(int creativity) {
		this.creativity = creativity;
	}


	public int getJavaScript() {
		return javaScript;
	}


	public void setJavaScript(int javaScript) {
		this.javaScript = javaScript;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	@Override
	public String toString() {
		return "User [incID=" + incID + ", userEmail="  + ", userUsername=" + userUsername + ", userPass="
				+ userPass + ", userName=" + userName + ", userDescriptiom=" + ", userJob=" + ", userCity=" + ", userPhoneNumber="  + ", userStreet=" 
				+ "]";
	}




	public  int getsID() {
		return sID;
	}


	


	

	public int getCss() {
		return css;
	}


	public void setCss(int css) {
		this.css = css;
	}


	public int getHtml() {
		return html;
	}


	public void setHtml(int html) {
		this.html = html;
	}


	public String getUserUsername() {
		return userUsername;
	}


	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	


	





	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + incID;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPass == null) ? 0 : userPass.hashCode());
		result = prime * result + ((userUsername == null) ? 0 : userUsername.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (incID != other.incID)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPass == null) {
			if (other.userPass != null)
				return false;
		} else if (!userPass.equals(other.userPass))
			return false;
		if (userUsername == null) {
			if (other.userUsername != null)
				return false;
		} else if (!userUsername.equals(other.userUsername))
			return false;
		return true;
	}
	

	
	

}
