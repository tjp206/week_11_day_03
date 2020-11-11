public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public String talk(String speech) {
        return "Wow I can " + speech;
    }

    public String walk(String steps) {
        return "Look at me I can " + steps;
    }
}
