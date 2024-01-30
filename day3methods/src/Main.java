public class Main {

    public static void main(String[] args) {

        User user1 = new User("Bahadir",12);

        user1.UserCheck();

        try{
            user1.UserCheck2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}

