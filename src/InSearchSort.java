public class InSearchSort {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] list ={3,2,7,9,6,4,2,1};
        System.out.println("\nBegin sort processing...");
        inSearchSortByStep(list);
        System.out.println("thoi gian chay cua sap xep noi bot la : "+ (System.nanoTime()-startTime) + "nano time");
    }


    public static void inSearchSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }


}

