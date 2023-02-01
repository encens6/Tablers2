public class Main {
    public static void main(String[] args){
        int[] rack = new int[4];
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 10;

        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;

        boolean rackAreEqual = true;

        rackAreEqual = rack.length == rack2.length;

        if (rackAreEqual) {
            for (int i = 0; i < rack.length; i++) {
                if (rack[i] != rack2[i]) {
                    rackAreEqual = false;
                }
            }
        }

        if (rackAreEqual) {
            System.out.println("Equal racks");
        } else {
            System.out.println("Rack are not equal");
        }

        training();
        task123();
        task4();
    }

    public static void training() {
        int[] weights = {90, 65, 48, 459, 654, 452};
        int[] weightsCopy = {90, 65, 48, 459, 656, 452};

        boolean arraysAreEqual = true;

        arraysAreEqual = (weights.length == weightsCopy.length);
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }

            }

        if (arraysAreEqual) {
            System.out.println("Tablers are equal");
        } else {
            System.out.println("Tablers are different");
        }

        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);

        ///

        int maxWeight1 = -1;
        for (int current : weightsCopy) {
            if (current > maxWeight1) {
                maxWeight1 = current;
            }
        }
        System.out.println(maxWeight1);

        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++){
            System.out.println(weights[i + 1] - weights[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task123() {
        System.out.println("Task 1 2 3 :");
        int[] arr = generateRandomArray();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        double average = (double) sum / arr.length;
        System.out.println("The amount of expensses is " + sum + " roubles.");
        System.out.println("The minimum daily expend was " + min + " roubles. The max daily expensse is " + max + " roubles.");
        System.out.println("The monthly amount of expenses is " + average + " roubles.");
    }

    public static void task4() {
        System.out.println("Task 4 :");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int n = reverseFullName.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = temp;
        }

        System.out.println(reverseFullName);
        
    }
}

/////

