public class User {public User(String name,int age){

    this.name = name;
    this.age=age;
}
    int id;
    String name;
    int age;

    //erisim bildirgeci - return type - method ismi (inputlar)
    public void UserCheck(){

        if(this.name.length()<=2){
            System.out.println("Karakter ismi 2den kisa olamaz");
        }

        if(this.age<18){
            System.out.println("18 yas alti sisteme kayit olamaz");
        }
    }

    public Error UserCheck2() {

        if (this.name.length() <= 2) {
            throw new Error("Karakter ismi 2den kisa olamaz");
        }

        if (this.age < 18) {
            throw  new Error("18 yas alti sisteme kayit olamaz");
        }

        return null;

    }
}
