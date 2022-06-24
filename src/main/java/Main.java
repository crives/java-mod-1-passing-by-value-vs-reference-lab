public class Main {
    public static void main(String[] args) {
        NumberContainer numContainer = new NumberContainer();
        multiply(3, 5, numContainer);

// Modify the method above so that the calling method cannot see the result of the multiplication
// Write a method that can modify a String that is passed in, in such a way that the calling method 
// can see the modified new value for the String parameter
// Write a method that takes a String parameter, modifies it and shows that the calling method 
// cannot see the modified value
    }


// Write a method that multiplies two numbers and stores the result in a variable that was passed in 
// as a parameter. Make the calling method display the result of the multiplication.
    public static void multiply(int int1, int int2, NumberContainer numCon) {
       numCon.num = int1 * int2;
       System.out.println("Result is " + numCon.num);
    }
}

