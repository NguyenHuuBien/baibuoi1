public class Human {
    private String walk;
    private String eat;

    public Human(String walk, String eat) {
        this.walk = walk;
        this.eat = eat;
    }

    public Human(Human Humen) {
        System.out.println(Humen.walk() + "," + Humen.eat());
    }

    private String walk() {
        return this.walk;
    }

    private String eat() {
        return this.eat;
    }

    public static void main(String[] args) {
        String walk = "\"I'm walking\"";
        String eat = "\"I'm eating\"";
        Human human = new Human(walk, eat);
        Human hm = new Human(human);
    }
}