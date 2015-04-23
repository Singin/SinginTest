package SinginTest;

public class User {
private String prenom;

  public User(String prenom) {
	this.prenom = prenom;
  }

  public void afficherPrénom(){
	System.out.println(prenom);
  }
  
  @Override
  public String toString() {
	return "User{" + "prenom=" + prenom + '}';
  }


}
