/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		cit = cit - citBuyCount;
		syo = syo - syoBuyCount;
		pis = pis - pisBuyCount;

		System.out.println("\nほんじつのおすすめ商品です");
		System.out.println("シトロン　　　\\259・・・残り" + cit + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + syo + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pis + "個");

	}

}
