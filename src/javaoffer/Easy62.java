package javaoffer;

import org.junit.Test;

/**
 * 0,1,。。。,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，
 * 从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 * 示例 1：
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 * 输入: n = 10, m = 17
 * 输出: 2
 *
 * 限制：
 * 1 <= n <= 10^5
 * 1 <= m <= 10^6
 *
 * 思路：这叫什么，枪毙问题
 *这道题是一道约瑟夫环的问题，f(n,m)为n个人每m个枪毙一个最后剩下那个人。
 * f(n,m)=(f(n−1,m)+m)%n，且f(1,m)=0
 *
 */
public class Easy62 {
	public int lastRemaining(int n, int m) {
		int flag = 0;
		for (int i = 2; i <= n; i++) {
			flag = (flag + m) % i;
			//动态规划的思想，将f(n,m)替换成flag存储
		}
		return flag;
	}

	//递归
	public int lastRemaining2(int n, int m){
		if(n < 1 || m < 1)
			return -1;
		if(n == 1)
			return 0;
		return (lastRemaining2(n-1, m) + m) % n;
	}

	@Test
	public void test1() {
	}

}
