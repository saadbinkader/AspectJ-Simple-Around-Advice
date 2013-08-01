public class Human {
    Random randomGenerator ;

    public Human() {
        randomGenerator = new Random();
    }

    private void takeTime() {
        int time = randomGenerator.nextInt(500);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat() {
        takeTime();
    }

    public void walk() {
        takeTime();
    }

    public void goToSleep() {
        takeTime();
    }
}
