public class Main {
    public static void main(String[] args) {
        NumberContainer numContainer = new NumberContainer();
        multiply(3, 5, numContainer);
        System.out.println("Result is " + numContainer.num);

        StringContainer strContainer = new StringContainer();
        strContainer.stringy = "Hello";
        modifyString(strContainer, ". How are you?");
        System.out.println("String is " + strContainer.stringy);
    }

//1) Write a method that multiplies two numbers and stores the result in a variable that was passed in 
//    as a parameter. Make the calling method display the result of the multiplication.
    // public static void multiply(int int1, int int2, NumberContainer numCon) {
    //    numCon.num = int1 * int2;
    //    System.out.println("Result is " + numCon.num);
    // }

//2) Modify the method above so that the calling method cannot see the result of the multiplication
public static void multiply(int int1, int int2, NumberContainer numCon) {
    numCon = new NumberContainer();
    numCon.num = int1 * int2;
 }

 //3) Write a method that can modify a String that is passed in, in such a way that the calling method 
 //   can see the modified new value for the String parameter
// public static void modifyString(StringContainer str, String addition) {
//     str.stringy = str.stringy + addition;
// }

//4) Write a method that takes a String parameter, modifies it and shows that the calling method 
//   cannot see the modified value
public static void modifyString(StringContainer str, String addition) {
    str = new StringContainer();
    str.stringy = str.stringy + addition;
}
}

