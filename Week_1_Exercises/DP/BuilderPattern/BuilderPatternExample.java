package BuilderPattern;

public class BuilderPatternExample {
 public static void main(String[] args) {
     Computer basicComputer = new Computer.Builder()
         .setCPU("Intel i5")
         .setRAM("8GB")
         .setStorage("1TB HDD")
         .build();

     System.out.println("Basic Computer: " + basicComputer);

     Computer gamingComputer = new Computer.Builder()
         .setCPU("Intel i9")
         .setRAM("32GB")
         .setStorage("1TB SSD")
         .setGPU("NVIDIA GTX 3080")
         .setMotherboard("ASUS ROG")
         .build();

     System.out.println("Gaming Computer: " + gamingComputer);
 }
}
