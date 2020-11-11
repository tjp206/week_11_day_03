public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String eat(String food){
        return "I love to eat " + food;
    }

    public String breathe(String air){
        return "I love breathing " + air;
    }


}
