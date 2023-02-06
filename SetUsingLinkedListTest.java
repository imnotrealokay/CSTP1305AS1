import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SetUsingLinkedListTest {

    private SetUsingLinkedList<String> set;

    @Before
    public void setUp() {
        set = new SetUsingLinkedList<>();
    }

    @Test
    public void testGetCurrentSize() {
        assertEquals(0, set.getCurrentSize());
        set.add("A");
        set.add("B");
        set.add("C");
        assertEquals(3, set.getCurrentSize());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add("A");
        assertFalse(set.isEmpty());
    }

    @Test
    public void testAdd() {
        assertTrue(set.add("A"));
        assertTrue(set.contains("A"));
        assertFalse(set.add("A"));
        assertTrue(set.add("B"));
    }

    @Test
    public void testRemove() {
        set.add("A");
        set.add("B");
        set.add("C");
        assertTrue(set.remove("B"));
        assertFalse(set.contains("B"));
        assertFalse(set.remove("B"));
        assertTrue(set.remove("A"));
        assertEquals(1, set.getCurrentSize());
    }

    @Test
    public void testClear() {
        set.add("A");
        set.add("B");
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.getCurrentSize());
    }

    @Test
    public void testContains() {
        set.add("A");
        set.add("B");
        assertTrue(set.contains("A"));
        assertTrue(set.contains("B"));
        assertFalse(set.contains("C"));
    }

    @Test
    public void testToArray() {
        set.add("A");
        set.add("B");
        set.add("C");
        String[] expected = {"A", "B", "C"};
        assertArrayEquals(expected, set.toArray());
    }
}
