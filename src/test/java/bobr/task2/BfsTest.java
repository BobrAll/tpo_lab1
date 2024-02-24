package bobr.task2;

import org.junit.jupiter.api.Test;

import static bobr.task2.Bfs.search;
import static org.junit.jupiter.api.Assertions.*;

class BfsTest {

    @Test
    void searchTest() {
        Tree root = new Tree(10); // root
        Tree newChild = root.addChild(5); // root first child
        root.addChild(7); // root second child
        root.addChild(15); // root third child
        Tree newChildChild = newChild.addChild(115); // root first child -> child
        Tree newChildChildChild = newChildChild.addChild(207); // root first child -> child -> child
        Tree newChildChildChildChild = newChildChild.addChild(500);

        Tree foundNode = search(500, root); // BFS search

        assertNotNull(foundNode);
        assertEquals(500, foundNode.getValue());

        Tree nullNode = search(501, root);
        assertNull(nullNode);
        assertThrows(NullPointerException.class, () -> nullNode.getValue());

        Tree foundNodeBySubTree = search(500, newChildChild);
        assertNotNull(foundNodeBySubTree);
        assertEquals(500, foundNodeBySubTree.getValue());
    }
}