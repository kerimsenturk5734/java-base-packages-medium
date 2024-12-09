package ObjectExamples;

public class Run{
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // Product sınıfının bir örneğini oluşturalım
        Product product = new Product(12.3, "Tomato");

        // super class'ını yazdıralım
        System.out.println(
                "Super class of Product -> " +
                        product.getClass().getSuperclass());

        // Product sınıfının bir örneğini oluşturalım
        Product schoolProduct = new SchoolProduct(12.3, "Book", 342);

        // schoolProduct'ın super class'ını yazdıralım
        System.out.println(
                "Super class of SchoolProduct -> " +
                        schoolProduct.getClass().getSuperclass());

        // Primitive tipin super class'ını almaya çalışalım
        System.out.println(int.class.getSuperclass());

        // Primitive tipteki array'in sınıfını ve super class'ını alalım
        double[] priceList = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        System.out.println("Class of priceList -> " +
                priceList.getClass());

        System.out.println("Super Class of priceList -> " +
                priceList.getClass().getSuperclass());

        // toString methodunu override ettiğimizi product objesini yazdıralım
        System.out.println(product);

        // product ı klonlayalım
        Product clonedProduct = product.clone();
        // yazdıralım
        System.out.println("Cloned Product -> " + clonedProduct);
        System.out.println("Original Product -> " + product);

        // Thread'lerde kullanacağımız schoolProduct objesini oluşturalım
        SchoolProduct sharedSchoolProduct = new SchoolProduct(34.56, "Bag", 420);

        // İki işlem için iki thread oluşturalım
        Thread thread1 = new Thread(sharedSchoolProduct::performTask, "Thread-1");
        Thread thread2 = new Thread(sharedSchoolProduct::otherTask, "Thread-2");

        // thread'leri çalıştıralım
        thread1.start();
        // İşlemi görmek için main thread'i bekletelim biraz
        Thread.sleep(5000);
        thread2.start();
    }
}
