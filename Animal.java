public class Animal {
   
    public static void main(String[] args) {
         
        String output ="Hello";
        if(args[0].equals("bird")){
            output="tweet";
        }else if(args[0].equals("cat")){
            output="Meow"; 
        }else{
            System.out.println(output);

        }

        System.out.println(output);
    }
}