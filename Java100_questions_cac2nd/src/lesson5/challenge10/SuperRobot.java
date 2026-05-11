package lesson5.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {
	String makeDish(int cavNum, int foNum, int truNum, int soltNum) {

		int count = 0;

		if (cavNum >= 100)
			count++;
		if (foNum >= 1)
			count++;
		if (truNum >= 10)
			count++;

		String dish = null;

		if (count == 3 && soltNum >= 10) {
			dish = "世界一おいしい品";

		} else if (count >= 2 && soltNum >= 10) {
			dish = "おいしい品";

		} else if (cavNum >= 100 && soltNum >= 10) {
			dish = "キャビア";

		} else if (foNum >= 1 && soltNum >= 10) {
			dish = "フォアグラ";

		} else if (truNum >= 10 && soltNum >= 10) {
			dish = "トリュフ";

		} else {
			dish = null;
		}

		return dish;
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("塩を10g以上入れないとうまく調理できません");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("キャビアの量を入力してください（グラム）＞");
		String cavStr = br.readLine();
		int cav = Integer.parseInt(cavStr);

		System.out.println("フォアグラの量を入力してください（個数）＞");
		String foStr = br.readLine();
		int fo = Integer.parseInt(foStr);
		System.out.println("トリュフの量を入力してください（個数）＞");
		String truStr = br.readLine();
		int tru = Integer.parseInt(truStr);
		System.out.println("塩の量を入力してください（グラム）＞");
		String soltStr = br.readLine();
		int solt = Integer.parseInt(soltStr);

		SuperRobot superRobot = new SuperRobot();
		String dish = superRobot.makeDish(cav, fo, tru, solt);
		if (dish != null) {
			System.out.println("\n" + dish + "が出来ました。");
		} else {
			System.out.println("\n調理に失敗しました");
		}
	}

}
