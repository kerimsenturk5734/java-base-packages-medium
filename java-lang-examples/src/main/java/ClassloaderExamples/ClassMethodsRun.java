package ClassloaderExamples;

public class ClassMethodsRun implements Runnable{
    @Override
    public void run() {
        // Bu User sınıfının Class olarak örneğini alalım
        Class<User> clazz = User.class;

        // Ya da bir örnek üzerinden de alabiliriz.
        User user = new User("John", 20, "MySecretPassword");
        Class<?> userClass = user.getClass();

        // Sınıfımızın adını alalım
        String name = clazz.getName();

        // Sınıf adını yazdıralım
        System.out.println("Class name : " + name);

        // ClassLoader'ı alalım
        ClassLoader classLoader = clazz.getClassLoader();

        // Yazdıralım
        System.out.println("ClassLoader : " + classLoader);

        //Class<?> clazz3 = Class.forName("User"); // ClassNotFoundException
        // Full sınıf ismiyle sınıfı yükleyelim
        Class<?> clazz3 = null;
        try {
            clazz3 = Class.forName("ClassloaderExamples.User");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Yüklenen sınıfın adını yazdıralım
        System.out.println("Loaded Class : " + clazz3.getName());

        // User sınıfı için Package ı elde edelim
        Package userPackage = userClass.getPackage();

        // Package name i yazdıralım
        System.out.println("User Package name : " + userPackage.getName());

        // int için package almaya çalışalım
        Class<?> intClass = int.class;
        Package intPackage = intClass.getPackage();
        System.out.println("Int Package : " + intPackage);

        // int[] için package almaya çalışalım
        Class<?> intArrayClass = int[].class;
        Package intArrayPackage = intArrayClass.getPackage();
        System.out.println("Int Array Package : " + intArrayPackage);

        // Void için package almaya çalışalım
        Class<?> voidClass = void.class;
        Package voidPackage = voidClass.getPackage();
        System.out.println("Void Package : " + voidPackage);
    }
}
