import java.security.PublicKey;

public class testInterfaces {
    public static void main(String[] args) {
        Chien chien = new Chien();
        Lion lion = new Lion();
        Serpent serpent = new Serpent();
        chien.manger();
        serpent.manger();
        lion.manger();
    }
}