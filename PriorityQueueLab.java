import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueLab {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        try (Scanner scanner = new Scanner(new File("RandIntegers.txt"))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                priorityQueue.add(number);  
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'RandIntegers.txt' was not found.");
        } 

        System.out.println("Priority Queue:");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.peek());   
            priorityQueue.remove();                     
        }
    }
}
