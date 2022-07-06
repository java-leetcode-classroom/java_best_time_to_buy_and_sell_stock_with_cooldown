public class Solution {
  public int maxProfit(int[] prices) {
    int pLen = prices.length;
    int[] dpSell = new int[pLen+2];
    int[] dpBuy = new int[pLen+2];
    for (int start = pLen - 1; start >= 0 ; start--) {
      dpBuy[start] = Math.max(dpBuy[start+1], dpSell[start+1]-prices[start]);
      dpSell[start] = Math.max(dpSell[start+1], dpBuy[start+2] + prices[start]);
    }
    return dpBuy[0];
  }
}
