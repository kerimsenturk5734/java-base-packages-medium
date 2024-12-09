package ObjectExamples;

public class SchoolProduct extends Product {
    private int stock;

    public SchoolProduct(double price, String name, int stock) {
        super(price, name);
        this.stock = stock;
    }
    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    // Senkron bir işlemimiz var diyelim
    public synchronized void performTask(){
        try{
            // Mevcut thread için durum bilgilerini yazdıralım
            System.out.println(
                    Thread.currentThread().getName() + " waiting... on " + this);
            //wait durumuna geçirelim
            wait();
            System.out.println(
                    Thread.currentThread().getName() + " resumed on " + this);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void otherTask(){
        // Mevcut thread için durum bilgilerini yazdıralım
        System.out.println(
                Thread.currentThread().getName() + " notifying... any waited thread on " + this);
        // thread'leri uyandıralım
        notify();
    }
}

