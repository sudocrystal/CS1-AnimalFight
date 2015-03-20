import java.util.Random;

public class ExampleAnimal extends Animal{
   public ExampleAnimal(String name, int speed){
      // any param unnecessary
      super(speed, 25, 15);
      super.name = name; // the animal's name
      super.trueName = "ExampleAnimal"; // the creator's name (your name)
   }

   public String getName(){
      return super.name;
   }
   
   public String getTrueName(){
      return super.trueName;
   }
   
   public char interact(Animal animal){
      if (new Random().nextBoolean()){
         return 'A';
      }
      else if (new Random().nextBoolean()){
         return 'D';
      }
      else if (new Random().nextBoolean()){
         return 'I';
      }
      else{
         return 'R';
      }
   }
}