// Danny Castaneda SP21 Advanced Language Java
//Models a heavy "Box", includes Four private integer instance variables store the Length, Width, Height and Weight of
//the Box. Measurements are in feet and pounds.

public class Box {
   private int length ;
   private int width ;
   private int height ;
   private int weight ;
  
  
   public Box() {
       this.length = 0 ;
       this.width = 0 ;
       this.height = 0 ;
       this.weight = 0 ;
   }
   public Box(int length, int width, int height, int weight) {
       super();
       this.length = length;
       this.width = width;
       this.height = height;
       this.weight = weight;
   }
  
   public int getLength() {
       return length;
   }
   public void setLength(int length) {
       this.length = length;
   }
   public int getWidth() {
       return width;
   }
   public void setWidth(int width) {
       this.width = width;
   }
   public int getHeight() {
       return height;
   }
   public void setHeight(int height) {
       this.height = height;
   }
   public int getWeight() {
       return weight;
   }
   public void setWeight(int weight) {
       this.weight = weight;
   }
   public double calculateVolume() {
       return this.height * this.width * this.length ;
   }
   public double calculateDensity() {
       if(this.calculateVolume() != 0)
           return this.weight / this.calculateVolume() ;
       return 0 ;
   }
   public String toString() {
       return "This Box has:\n\tLength = " + this.length + ", Width = " + this.width + ", Height = " + this.height + ", Weight = " + this.weight + "\n\tVolume = " + this.calculateVolume() + "\n\tDensity = " + this.calculateDensity();
   }
}