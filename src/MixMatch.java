public class Hello {
   public static void main(String[] ars) {
       // variables declared
       String strgVar = "Hello World";
       char charVar = 'R';
       short shortVar = 20000;
       int intVar = 24;
       long longVar = 123456789012345678L;
       float floatVar = 2.56F;
       double doubVar = 23.6789134;
       boolean boolVar = true;
       
       // explanations
       System.out.println(strgVar + " <- String: Stores a string of characters.");
       System.out.println(charVar + " <- Char: Stores a single character.");
       System.out.println(shortVar + " <- Short: Stores whole numbers from -32,768 to 32,767.");
       System.out.println(intVar + " <- Int: Stores whole numbers from -2,147,483,648 to 2,147,483,647.");
       System.out.println(longVar + " <- Long: Stores large whole numbers - 9 quintillion to 9 quintillion.");
       System.out.println(floatVar + " <- Float: Stores decimal numbers; up to 7 digits of precision.");
       System.out.println(doubVar + " <- Double: Stores decimal numbers; up to 15 digits of precision.");
       System.out.println(boolVar + " <- Boolean: Stores either true or false.");
       
       // print in one line
       System.out.println("All variables: " + strgVar + ", " + charVar + ", " + shortVar + ", " + intVar + ", " + longVar + ", " + floatVar + ", " + doubVar + ", " + boolVar);
   }
}