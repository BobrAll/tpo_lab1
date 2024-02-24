package bobr.task2;

import java.util.ArrayDeque;
import java.util.Queue;


public class Bfs {

    public static Tree search(int value, Tree root) {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root); // first we add the root node as the
        // only member of the queue

        while(!queue.isEmpty()) {

            System.out.print("Current queue: ");
            for (Tree item: queue) {
                System.out.print(item.getValue() + " ");
            }
            System.out.println();

            Tree currentNode = queue.remove(); // we remove the first node in queue
            // and save it as currentNode

            // check for "win" condition
            if (currentNode.getValue() == value) {
                System.out.println("Finished searching!");
                return currentNode;
            }
            // if we did not find the value we are looking for..
            // add all children to the queue in order
            else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return null;
    }
}