package bobr.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void getValue() {
        Tree root = new Tree(10);
        assertEquals(root.getValue(), 10);

        root.addChild(11);
        root.addChild(12);

        assertEquals(11, root.getChildren().remove(0).getValue());
        assertEquals(12, root.getChildren().remove(0).getValue());
    }

    @Test
    void children() {
        Tree root = new Tree(10);
        root.addChild(11);
        root.addChild(12);

        assertEquals(2, root.getChildren().size());

        assertEquals(11, root.getChildren().remove(0).getValue());
        assertEquals(12, root.getChildren().remove(0).getValue());
    }
}