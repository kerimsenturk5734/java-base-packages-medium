package ClassloaderExamples;

public class User {
    private String name;
    private int age;
    private String password;

    // Toplam kullanıcı sayısını belirten static bir alan ekleyelim
    public static int count = 100;

    // Sınıf başlangıcında çalışacak static bir alan ekleyelim
    static{
        System.out.println("User class loaded successfully");
        System.out.println("User Count: " + count);
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
