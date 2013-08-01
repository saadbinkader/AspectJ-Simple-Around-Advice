public class Tester {
    public static void main(String[] args) {
        Human human = new Human() ;
        for ( int day = 1 ; day < 11 ; day++ ) {
            System.out.println( "Day : ["+day+"]");
            human.walk();
            human.eat();
            human.goToSleep();
        }
    }
}
