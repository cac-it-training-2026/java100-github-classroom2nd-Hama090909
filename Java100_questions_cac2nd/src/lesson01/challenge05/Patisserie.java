/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int cit = 30;
		int syo = 30;
		int pis = 30;

		System.out.println("\n本日のおすすめ商品");
		System.out.println("シトロン    \\250・・・残り" + cit + "個");
		System.out.println("ショコラ    \\250・・・残り" + syo + "個");
		System.out.println("ピスターシュ\\320・・・残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.println("シトロン   >");
		String citBuyCountStr = br.readLine();
		int citBuyCount = Integer.parseInt(citBuyCountStr);

		System.out.println("ショコラ  >");
		String syoBuyCountStr = br.readLine();
		int syoBuyCount = Integer.parseInt(syoBuyCountStr);

		System.out.println("ピスターシュ  >");
		String pisBuyCountStr = br.readLine();
		int pisBuyCount = Integer.parseInt(pisBuyCountStr);

		System.out.println("\nシトロン" + citBuyCount + "個");
		System.out.println("\nショコラ" + syoBuyCount + "個");
		System.out.println("\nピスターシュ" + pisBuyCount + "個");

		int totalBuyCount = citBuyCount + syoBuyCount + pisBuyCount;
		int totalPrice = 250 * citBuyCount + 280 * syoBuyCount + 320 * pisBuyCount;

		System.out.println("\n合計個数" + totalBuyCount + "個");
		System.out.println("合計金額" + totalPrice + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました");

	}
}
