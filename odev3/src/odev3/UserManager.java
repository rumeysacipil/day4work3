package odev3;

public class UserManager {
 public void editProfile() {
	 System.out.println("de�i�iklikler kaydedildi");
 }
 public void adduser(User user) {
	 System.out.println(user.getFirstName()+" isimli kullan�c� eklendi");
 }
 public void logout(User user) {
	System.out.println(user.getFirstName()+" sistemden ��k�� yapt�");
}
}
