package chirica;

/* *
 * This project was created for educational purposes.
 * Copyright (c) 2022. All rights reserved. 
 * @author Stefan Chirica
 */
public class Student {

    String name;
    int group;
    boolean isStarred = false;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsStarred() {
        if (name != null) {
            if (!name.equals("")) {
                if (name.charAt(0) == '*') {
                    isStarred = true;
                }
            } else {
                isStarred = false;
            }
        } 

        return isStarred;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

}
