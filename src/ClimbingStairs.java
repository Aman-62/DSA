public class ClimbingStairs {
  public static void main(String[] args) {
    int num = climbingStairs(8);
    System.out.println(num);
  }

  public static int climbingStairs(int n) {
    if (n == 1)
      return 1;

    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
  /*
   * n=8
   * dp[9]
   * [0, 1, 2, 3, 5, 8, 13, 21, 34]
   * int i=3; true; dp[3]=2+1=3; i=4
   * true; dp[4]=3+2=5; i=5
   * true; dp[5]=5+3=8; i=6
   * true; dp[6]=8+5=13; i=7
   * true; dp[7]=13+8=21; i=8
   * true; dp[8]=21+13=34; i=9
   * false
   */
}
