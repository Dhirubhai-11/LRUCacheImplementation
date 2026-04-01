import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cache capacity: ");
        int capacity = sc.nextInt();

        LRUCache cache = new LRUCache(capacity);

        while (true) {
            System.out.println("\n===== LRU Cache Menu =====");
            System.out.println("1. Put (key, value)");
            System.out.println("2. Get (key)");
            System.out.println("3. Display Cache");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    cache.put(key, value);
                    System.out.println("Inserted!");
                    cache.display();
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int k = sc.nextInt();

                    int result = cache.get(k);
                    if (result == -1) {
                        System.out.println("Key not found!");
                    } else {
                        System.out.println("Value: " + result);
                    }
                    cache.display();
                    break;

                case 3:
                    cache.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}