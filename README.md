# Minpro_PBO1
package Model;

 class Animal {
    private String name;
    private String type;
    private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Age: " + age;
    }
}
