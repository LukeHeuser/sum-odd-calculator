public class SumOdd {
    public static void main(String[] args) {

        System.out.println(sumOdd(45,65));
        System.out.println(sumOdd(0,450));
        System.out.println(sumOdd(1948,2024));
        System.out.println(sumOdd(0,10000));
        System.out.println(sumOdd(650,50));
        


    }
    public static boolean isOdd(int number){

        if (number > 0) {
            return number % 2 == 1;
        }
        return false;

    }

    public static int sumOdd(int start, int end){

        if(end < start || start < 0 || end < 0) {
            return -1;
        }

        int totalSum = 0;
        for(int i = start; end >= start; start ++){
            if(isOdd(start)) {
                totalSum += start;
            }
        }

        return totalSum;
    }
}
