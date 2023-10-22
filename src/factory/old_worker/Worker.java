package factory.old_worker;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private int number;
    private int age;
    private int experience;

    public Worker(String fullName, String position, String email, int number, int old, int experience) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = old;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            throw new IllegalArgumentException();
        }
        this.experience = experience;
    }
}
