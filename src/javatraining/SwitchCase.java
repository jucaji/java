package javatraining;

public class SwitchCase {

    public static void main(String[] args) {
        String weather = "sunny";
        switch(weather){
            case "sunny":
                System.out.println("It's sunny");
                break;
            case "rainy":
                System.out.println("It's rainy");
                break;
            case "cloudy":
                System.out.println("It's cloudy");
                break;
            default:
                System.out.println("It's something else");
        }
    }
}
