public class Timer {
    public static void seconds(int seconds){
        seconds = seconds * 1000;
        try
        {
            Thread.sleep(seconds);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void milliseconds(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }
    public static void minutes(int min){
        min = min * 60000;
        try
        {
            Thread.sleep(min);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }
}
