
public class ImutablePerson {
    private final String name;
    private final String[] hobby;

    public ImutablePerson(String name, String[] hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String[] getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "ImutablePerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
