public class zoo {
    public static void main(String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");

    }


    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food){
        if ( food == favoriteFood){
            System.out.println(name + " eats " + food + "YUM!!!" + name + );
        }
    }
}
