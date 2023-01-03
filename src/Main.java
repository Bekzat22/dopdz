import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

            System.out.println( generateRandomAge(rand.nextInt(101)));

    }
    public static int generateRandomAge(int i){
        Random rand = new Random();
        i = rand.nextInt(100);
        if(i >= 20 && i <= 45 ){
            System.out.println("Можно идти гулять");
        } else if( i < 20 ){
            System.out.println("Можно идти гулять");
        } else if(i > 45 ){
            System.out.println("Можно идти гулять");
        } else{
            System.out.println("Оставайтесь дома");
        }
        return i;
    }
}