package ClassloaderExamples;

public class Run {
    public static void main(String[] args) {
        Runnable r = new ClassMethodsRun();
        System.out.println("-----------------------------ClassMethodsRun---------------------");
        r.run();
        r = new ClassLoaderMethodsRun();
        System.out.println("-----------------------------ClassLoaderMethodsRun---------------------");
        r.run();
    }
}
