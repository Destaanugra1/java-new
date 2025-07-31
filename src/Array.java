public class Array {

    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Desta";
        arrayString[1] = "Anugra";
        arrayString[2] = "Pratama";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Dede";
        System.out.println(arrayString[0]);

        String[] arrayString2 = new String[2];

        String[] namaName = {
          "Desta", "Anugra", "Pratama"
        };

        System.out.println(namaName);

        int[] arrayInt = new int[]{
                10, 10, 50, 20
        };

        long[] arrayLong = {
          2, 3, 4, 9, 200, 19
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Desta", "Anugra"},
                {"Dede", "Tama"},
                {"Pratama"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
