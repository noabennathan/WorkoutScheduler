package Users;

import Common.Classes;

public class Student extends User {

    private boolean isRegistered;
    private Classes[] registeredClasses;

    public Student(String name, String id, int age, boolean registry) {
        super(name, id, age);
        this.isRegistered = registry;
        this.registeredClasses = new Classes[]{};
    }

    public boolean getRegistry() {
        return this.isRegistered;
    }

    public Classes[] getRegisteredClasses(){
        return this.registeredClasses;
    }
}
