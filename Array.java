public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Phiphi";
        stringArray[1] = "Benjamin";
        stringArray[2] = "Shibe";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Philip";

        System.out.println(stringArray[0]);
        
        String[] stringArray2 = new String[3];

        String[] namaNama = {
            "Phiphi", "Benjamin", "Shibe"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members =  {
            {"Phiphi", "Shibe"},
            {"Philip", "Shipley"},
            {"Phelps"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }

}