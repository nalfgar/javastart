public class arrays {

    public static void main(String[] args) {

        int[] array = new int[1000];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i*i;
        }

        for (int i1 : array) {
            sum += i1;
            System.out.println(i1);
        }

        System.out.println(sum);
    }
}
