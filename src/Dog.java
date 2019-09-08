public class Dog {

    private String name = "Vili";
    private String color = "black";

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public Dog (String setName){
        this.name = setName;
    }
    public String toString (){
        return this.name;
    }



}
