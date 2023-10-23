import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceTwo() {
    int[] input1 = {1, 2, 3, 4, 5};
    int[] output1 = {5, 4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(output1, input1);

    int[] input2 = {1,2};
    int[] output2 = {2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(output2, input2);
  }

  @Test
  public void testReversedTwo() {
    int[] input1 = {1,2,3,4,5};
    int[] output1 = {5,4,3,2,1};
    assertArrayEquals(output1, ArrayExamples.reversed(input1));
  }
}
