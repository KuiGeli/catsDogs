public class Cat {

   private String name = "Garfield";
   private String color = "oragne";

   public String getName (){
       return name;
   }
   public void setName (String newName){
       this.name = newName;
   }
   public String getColor (){
       return color;
   }
   public void setColor(String newColor){
       this.color = newColor;
   }


   public Cat (String setName){
       this.name = setName;
   }

   public String toString(){
       return this.name;
   }




}
