public class zoo {
    public static void main(String[] args) {
        zoo z = new zoo();
        z.eat("Tiger", "meat");
        z.sleep("Tiger");
        z.eat("Tiger", "bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep();
    }


    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food){
        if ( food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " eats " + food);
        }
    }
}


