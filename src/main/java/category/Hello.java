package category;

public class Hello {
    public String greetings(String name) {
        if (name == null) {
            return "hi, what's your name?";
        }
        return "hello, " + name;
    }
}
