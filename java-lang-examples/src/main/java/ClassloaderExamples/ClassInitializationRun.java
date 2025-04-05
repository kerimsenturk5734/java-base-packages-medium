package ClassloaderExamples;

public class ClassInitializationRun {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program has started");
        Thread.sleep(5000);

        //User sınıfını kullanalım
        int count = User.count;

        // Bundan sonra sınıf başlamış olacaktır.
    }
}
