public class Strip { //This class just strips all white space and sets to lower case letters.
    public String cut(String x){

        x = x.toLowerCase();
        x = x.replaceAll("[^a-z]", "");

        return x;

    }

}
