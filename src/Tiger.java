public class Tiger {
    String name;
    String favoriteFood;

    public Tiger(String name) {
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        if ( food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " eats " + food);
        }
    }


}