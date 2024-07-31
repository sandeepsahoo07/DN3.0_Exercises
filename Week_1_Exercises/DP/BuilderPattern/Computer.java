package BuilderPattern;

public class Computer {
 private final String CPU;
 private final String RAM;
 private final String Storage;
 private final String GPU;
 private final String motherboard;

 private Computer(Builder builder) {
     this.CPU = builder.CPU;
     this.RAM = builder.RAM;
     this.Storage = builder.Storage;
     this.GPU = builder.GPU;
     this.motherboard = builder.motherboard;
 }

 public String getCPU() {
     return CPU;
 }

 public String getRAM() {
     return RAM;
 }

 public String getStorage() {
     return Storage;
 }

 public String getGPU() {
     return GPU;
 }

 public String getMotherboard() {
     return motherboard;
 }

 @Override
 public String toString() {
     return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage 
            + ", GPU=" + GPU + ", Motherboard=" + motherboard + "]";
 }

 public static class Builder {
     private String CPU;
     private String RAM;
     private String Storage;
     private String GPU;
     private String motherboard;

     public Builder setCPU(String CPU) {
         this.CPU = CPU;
         return this;
     }

     public Builder setRAM(String RAM) {
         this.RAM = RAM;
         return this;
     }

     public Builder setStorage(String Storage) {
         this.Storage = Storage;
         return this;
     }

     public Builder setGPU(String GPU) {
         this.GPU = GPU;
         return this;
     }

     public Builder setMotherboard(String motherboard) {
         this.motherboard = motherboard;
         return this;
     }

     public Computer build() {
         return new Computer(this);
     }
 }
}
