package Users;

public class User {
    private final String name;
    private final String id;
    private final int age;

    public User(String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    public int Age()
    {
        return this.age;
    }
}
