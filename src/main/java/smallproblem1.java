public class smallproblem1 {
    // Define your endUp method outside of the main method
    public static String endUp(String str) {
        if(str.length() <= 3){
            return str.toUpperCase();
        }
        String firstPart = str.substring(0, str.length() - 3);
        String secondPart = str.substring(str.length() - 3).toUpperCase();
        return firstPart + secondPart;
    }

    public static void main(String[] args) {
        // Now, you can call your endUp method from the main method
        String result = endUp("hello");
        System.out.println(result);  // prints: "helLO"
    }
}
