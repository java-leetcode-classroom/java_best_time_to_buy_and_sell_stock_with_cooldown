import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void maxProfitExample1() {
    assertEquals(3, sol.maxProfit(new int[]{1,2,3,0,2}));
  }
  @Test
  void maxProfitExample2() {
    assertEquals(0, sol.maxProfit(new int[]{1}));
  }
}