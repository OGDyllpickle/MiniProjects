public class Converter
{
    private  int x;
    private  String y;
    private  String error = "Null";

    public Converter(){ //Default Constructor to change the string to "No number inputted" if no numbers are inputted"
        this.error = "N/A";
        this.y = "No number inputted.";
    }
    public Converter(int x){ //The int x will be the inputted number from the user.
        this.x = x;
    }
    public void DTB() { //Digit to binary Converter
        if (this.error.equals("N/A")) {
            System.out.println(this.y);
        } else {
            System.out.println(Integer.toBinaryString(this.x));
        }
    }
    public void BTD(){ //Binary to Digit Converter
        if(this.error.equals("N/A")) {
            System.out.println(this.y);
        }
        else{
            String check = Integer.toString(this.x);
            boolean CheckValue = check.matches(".*[2-9].*");

            if(CheckValue){
                System.out.println("Only 1s and 0s allowed.");
            }
            else{

                int result = Integer.parseInt(check, 2);
                System.out.println("Your Number was " + result);


            }

        }
    }
}





