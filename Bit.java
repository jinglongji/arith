class Bit {

  /**
   * 将参数转为二进制后, 返回最后一个1的位置所代表的数值。
   *
   * 例如，lowbit(38) = 2
   * 38 的二进制表示是 (0010 0110)
   * -38 = ~(0010 0110) + 1 = (1101 1001) + 1 = (1101 1010)
   * lowbit(34) = 38 & -38 = (0010 0110) & (1101 1010) = (10) = 2
   *
   * @param num
   * @return
   */
  public static int lowbit(int num) {
      return num & -num;
  }

  /**
   * 统计num的二进制表示中1的个数
   * @param num
   * @return
   */
  public static int bitCount(int num) {
    int count = 0;
    while (num != 0) {
      num &= num - 1; // 这一步可以清除最低位的1
      count ++;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.printf("38 的二进制最后一个1所代表的数值: %d\n", Bit.lowbit(38));
    System.out.printf("38 的二进制表示中1的个数: %d\n", Bit.bitCount(38));
  }
}
