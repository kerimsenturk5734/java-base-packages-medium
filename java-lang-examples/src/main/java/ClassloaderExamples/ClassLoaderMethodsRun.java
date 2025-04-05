package ClassloaderExamples;

import java.sql.Connection;

public class ClassLoaderMethodsRun implements Runnable{
    @Override
    public void run() {
        // ClassLoader'ların hepsini görmek için farklı paketlerden sınıfların classloader'larını al

        // java.lang üzerinden bir sınıfın ClassLoader'ına bakalım
        System.out.println("Boolean Class Package: " + Boolean.class.getPackage().getName());
        System.out.println("Boolean Class ClassLoader: " + Boolean.class.getClassLoader()); //null

        // java.sql üzerinden bir sınıfın ClassLoader'ına bakalım
        System.out.println("Connection Class Package: " + Connection.class.getPackage().getName());
        System.out.println("Connection Class ClassLoader: " + Connection.class.getClassLoader().getName());

        // ObjectExamples altındaki bir sınıfın ClassLoader'ına bakalım
        System.out.println("User Class Package: " + User.class.getPackage().getName());
        System.out.println("User Class ClassLoader: " + User.class.getClassLoader().getName());

        // ClassLoader'ların parent'larını göster
        //System.out.println("BootstrapClassLoader Parent: " + Boolean.class.getClassLoader().getParent()); //npe
        System.out.println("PlatformClassLoader Parent: " + Connection.class.getClassLoader().getParent());
        System.out.println("ApplicationClassLoader Parent: " + User.class.getClassLoader().getParent());

    }
}
