package lol;

public class Armor extends Item {
    int ac;

    public static void main(String[] args) {
        Armor armor =new Armor();
        Armor armor1 =new Armor();
        armor.name="护甲";
        armor.price=300;
        armor.ac=15;


        armor1.name="锁子甲";
        armor1.price=500;
        armor1.ac=40;

    }

}
