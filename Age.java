// Using command line arguments
class Age{
public static void main(String args[]){

   int age = Integer.parseInt(args[0]);

   if(age < 18){
         System.out.println("person is not eligible for casting vote");
   }else{
      System.out.println("You are eligible to cast vote.");
   }

}


}
// java Age 22