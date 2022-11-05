package Users;

import Common.Classes;

public class Teacher extends User{

    private Classes[] teachingClasses;

    public Teacher(String name, String id, int age) {
        super(name, id, age);
        this.teachingClasses = new Classes[] {};
    }

    public Classes[] getTeachingClasses(){
        return this.teachingClasses;
    }
}
