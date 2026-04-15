/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double citBuyCount = Double.parseDouble(citBuyCountStr);

		System.out.println("ショコラ  >");
		String syoBuyCountStr = br.readLine();
		double syoBuyCount = Double.parseDouble(syoBuyCountStr);

		System.out.println("ピスターシュ  >");
		String pisBuyCountStr = br.readLine();
		double pisBuyCount = Double.parseDouble(pisBuyCountStr);

		System.out.println("\nシトロン" + citBuyCount + "個");
		System.out.println("\nショコラ" + syoBuyCount + "個");
		System.out.println("\nピスターシュ" + pisBuyCount + "個");

		double totalBuyCount = citBuyCount + syoBuyCount + pisBuyCount;
		int totalPrice = (int) (250 * citBuyCount + 280 * syoBuyCount + 320 * pisBuyCount);

		System.out.println("\n合計個数" + totalBuyCount + "個");
		System.out.println("合計金額" + totalPrice + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました");

		cit = (int) (cit - citBuyCount);
		syo = (int) (syo - syoBuyCount);
		pis = (int) (pis - pisBuyCount);

		System.out.println("\n本日のおすすめ商品です");
		System.out.println("シトロン　　　\\259・・・残り" + cit + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + syo + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pis + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております");
		System.out.println("\n売り上げの割合");
		System.out.println("売上合計　　　\\" + totalPrice);
		System.out.println("\n内訳");
		System.out.println(
				"シトロン　　　\\" + (int) (250 * citBuyCount) + "・・・" + (int) ((250 * citBuyCount) / totalPrice * 100) + "%");
		System.out.println(
				"ショコラ　　　\\" + (int) (280 * syoBuyCount) + "・・・" + (int) ((280 * syoBuyCount) / totalPrice * 100) + "%");
		System.out.println(
				"ピスターシュ　\\" + (int) (250 * pisBuyCount) + "・・・" + (int) ((320 * pisBuyCount) / totalPrice * 100) + "%");

	}
}
