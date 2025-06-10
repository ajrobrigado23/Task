public class Task16 {

    public static void main(String[] args) {
        Gorilla gorilla =  new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {

        if (timeToEat) {
            System.out.println("lather, rinse and repeat");
            return true;
        }
        System.out.println("Didn't eat");
        return false;
    }

    @Override
    public void groom() {
        System.out.println("Pet at your own risk");
    }

    @Override
    public void pet() {
        System.out.println("Put gorilla food into cage");
    }
}

interface Animal {

    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}
