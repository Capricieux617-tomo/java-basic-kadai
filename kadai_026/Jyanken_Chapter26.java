package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	private Scanner scanner;
	
	//コンストラクタでスキャナーを初期化
	public Jyanken_Chapter26() {
		scanner = new Scanner(System.in);
		}
	
	// 1.自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
				
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.next();
		
		if(input.equals("r")||input.equals("s")||input.equals("p")) {
			
			return input;
			
		}else {
			System.out.println("正しいじゃんけんの手を入力してください");
			return getMyChoice();
			
		
		}
	}	
		
		
	// 2.対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] rspArray = {"r", "s", "p"};
		return rspArray[(int)Math.floor(Math.random()*3)];
	}
	
	
	// 3.じゃんけんを行うメソッド
	public void playGame() {
		HashMap<String,String> play = new HashMap<String,String>();
		play.put("r","グー");
		play.put("s","チョキ");
		play.put("p", "パー");
		
		String me = new String(getMyChoice());
		String you = new String(getRandom());
		
		System.out.println("自分の手は" + play.get(me) + "、対戦相手の手は" +play.get(you));
		
		//自分と相手のじゃんけんの手を比較する
		if(me.equals(you)) {
			System.out.println("あいこです");
		}else if(
			me.equals("r")&&you.equals("s")||
			me.equals("s")&&you.equals("p")||
			me.equals("p")&&you.equals("r")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
	
	//スキャナーをクローズするメソッドを追加
	public void closeScanner() {
		if(scanner != null) {
			scanner.close();
		}
	}
	
	
	
}
