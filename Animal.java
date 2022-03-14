public class Animal {
   
    public static void main(String[] args) {
        
        String output ="Hello";
        if(args[0].equals("bird")){
            output="tweet";
        }

        System.out.println(output);
    }
}