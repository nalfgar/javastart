public class arrays {

    public static void main(String[] args) {

        int[] arrayA = new int[1000];
        int[] arrayB = new int[1000];
        int sum = 0;

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i*i;
            arrayB[i] = i;
        }

        for (int i : arrayA) {
            sum += i;
        }

        for (int i : arrayB) {
            sum += i;
        }

        System.out.println(sum);
    }
}
