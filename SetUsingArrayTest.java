import static org.junit.Assert.*;

import org.junit.Test;

public class SetUsingArrayTest {

    @Test
    public void testAdd() {
        SetUsingArray<Integer> set = new SetUsingArray<>();
        assertTrue(set.add(1));
        assertTrue(set.contains(1));
        assertFalse(set.add(1)); // Should not add duplicate element
        assertEquals(1, set.getCurrentSize());
    }


    @Test
    public void testRemove(){
      SetUsingArray<String> set = new SetUsingArray<String>();
      set.add("one");
      assertEquals(1, set.getCurrentSize());

      set.remove("one");
      assertEquals(true, set.isEmpty());
      assertEquals(0, set.getCurrentSize());
    }


    @Test
    public void testClear() {
        SetUsingArray<Character> set = new SetUsingArray<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.clear();
        assertEquals(0, set.getCurrentSize());
        assertFalse(set.contains('a'));
        assertFalse(set.contains('b'));
        assertFalse(set.contains('c'));
    }
    
    @Test
    public void testIsEmpty() {
        SetUsingArray<Integer> set = new SetUsingArray<>();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
        set.remove(1);
        assertTrue(set.isEmpty());
    }
}