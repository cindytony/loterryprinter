import java.util.Random;

public class LotteryPrinter {
    public static void main(String[] args) {
        String lotteryNumber = "";
        Random random = new Random();
        lotteryNumber = generateLotteryNumber(random);
        System.out.println("Play this combination - It will make you rich");
        System.out.println(lotteryNumber);

    }
    private static String generateLotteryNumber(Random random){
        int ranOne = random.nextInt(49) +1;
        int ranTwo = random.nextInt(49) +1;
        int ranThree = random.nextInt(49) +1;
        int ranFour = random.nextInt(49) +1;
        int ranFive = random.nextInt(49) +1;
        int ranSix = random.nextInt(49) +1;
        String lottery = ranOne + " " + ranTwo +" " +ranThree +" "+ranFour+" "+ ranFive+ " " +ranSix;
        return lottery;


    }
}
